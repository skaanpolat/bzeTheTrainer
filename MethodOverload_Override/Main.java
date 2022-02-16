package MethodOverload_Override;

public class Main {

    public static void main(String[] args) {
        //Method overload.
        // Metod yapısını aynı tutup, farklı sayıda veya tamamen farklı parametrelerle kullanmak.

        System.out.println(topla(6, 4));
        // Direkt  değer olarak dönülmek isterse fonksiyonun veriyi dönüş tipi belirtiliyor ve o veri tipinde çıktı dönüyor.
        // Dolayısı ile değer doğrudan yazdırılabiliyor.

        topla(6, 4, 3);
        topla(4.8,10.5,3.14);
        //Herhangi bir değer olarak de Fonksiyon içine tanımlanan komut/lar sonucu olarak dönüş istenirse void.
        // Yani void bir değer döndürmez.


        //Method override.
        //İnherit edilen bir metodun içeriğini
        OverrideOrnek overrideOrnek = new OverrideOrnek();
        Insan insan = new Insan();
        insan.intro();
        overrideOrnek.intro();

    }


    public static int topla(int a, int b) {
        return ((a + b));
    }

    public static void topla(int a, int b, int c) {
        System.out.println((a + b + c));
    }
    public static void topla(double aa,double bb, double cc) {
        System.out.println((aa + bb + cc));
    }

    public static class Insan {
        int age;
        int head;

        public String yasimKacBasimKac(int age, int head) {
            this.age = age;
            this.head = head;
            return ("Yaşım: " + age + " Başım: " + head + "kilo");
        }

        public void intro() {
            System.out.println(yasimKacBasimKac(24, 78) + " şeklinde bir mahlukatım");
        }
    }

    public static class OverrideOrnek extends Insan {
        //Override

        @Override
        public void intro() {
            System.out.println("Abi beni override ettiler dediğinde gittim seni pezevenklerin elinden gittim aldım!");
        }
    }
}
