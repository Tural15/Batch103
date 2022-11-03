package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int price = 20000 ;

    public void hareketEt () {
        System.out.println("Honda guzel hareket eder...");

    }
    public void dur() {
        System.out.println("Honda guvenli durur...");
    }
     /*
     obje nasıl oluşturulur?

    1)class ismini yazınız - Car
    2) Objeye bir isim veriniz - myHonda
    3) =
    4) new keyword'ünü kullan - new
    5) Class ismi parantezle beraber - Car (); bu da constructor demek.

*/

    public static void main(String[] args) {

        //MethodCreation class'ından object oluşturduk
Car myHonda = new Car();

        System.out.println(myHonda.price);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();

        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));

        /*
         daha önceki yerden o bilgiyi getiriyor işte.
         o kalıptan bilgiyi süzüyor. aslında basit. classlar arası bağlantı gibi.
         */

     MethodCreation obj1 = new MethodCreation();
        System.out.println(obj1.ucSayiyiCarp(3,5,6));
    }
}
