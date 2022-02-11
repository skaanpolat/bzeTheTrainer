public class Main {

//      {2*(2+8) + 8/2 - 3}
//      {(a* (a+  (a+ (a*b)) ) + ((a+(a*b))/a) - b}


    public static void main(String[] args) {

        Func func = new Func();
        int a = 2;
        int b = 3;

        System.out.println(a);
        System.out.println(b);

        System.out.println(func.toplama((int)(func.carpma(a,(int) func.toplama(a,(int)func.toplama(a,(int)func.carpma(a,b))))),
                (int)(func.cikartma((int)func.bolme(((int)func.toplama(a,(int)func.carpma(a,b))),a),b))));



    }


}
