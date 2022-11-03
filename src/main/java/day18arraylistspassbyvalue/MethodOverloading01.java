package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
        /*
        Method overloading nasıl yapılır?
        1) Method işlemleri aynı olmalıdır.
        2) Method parametreleri farklı olmalıdır.
         i ) parametre sayıları değiştirile bilir.
         ii ) parametrelerin data tiplerini değiştire biliriz.
         iii ) parametrelerin yerlerini değiştire biliriz. ancak data tipleri farklı ise

         3) Method ismi + parametreler = method signature
         4) Method signature dışında ne değiştirirseniz değiştirin Java o methodları farklı kabul etmez
          mesela public private olsa da farketmez.
         */


    }

    public static void add(int a,int b) { System.out.println(a+b); }

    public static void add(int a,int b, int c) { System.out.println(a+b+c); }

    public static void add(int a,double b) { System.out.println(a+b); }

    public static void add(double a,int b) { System.out.println(a+b); }

}
