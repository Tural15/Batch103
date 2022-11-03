package day02methodcreation;

public class MethodCreation {
    public static void main(String[] args) {
//main method içinde kullanıcağımız herşey static olamlıdır. o yüzden mothodlara da static yazdık.

        System.out.println(toplamaYap(15.8, 5));

        // return sout ekranına sonucu aktarıyor.
        System.out.println(ucSayiyiCarp(2, 1.5, 6) + " " + ucSayiyiCarp(1, 3.5, 7));

        System.out.println(ilkIkiSayiyiToplaSonraCarp(1.5,3,7.8));

        //sout enter'a bas = System.out.println

        // ekrana bir şey yazdırmak için 2 tane kod var. birincisi, sout - diğeri system.out.print

        // println'de diğer şeyler bir alttaki satıra yazılır
        // print'de ise aynı satırda devam eder.





    }

    /*
1)public: access modifier
2) static - sonra
3) void - bu method yeni bir data üretmiyor demektir. örneğin ekrana bir şey yazdırma methodu,
bir tuşa tıklama metodu gibi

Java ilk önce main methodlara bakar. ondan sonra diğer kısımlar çalışır.
 main method arabanın motoru gibidir. Java bunsuz çalışmaz
 Toplama işlemi yapan method oluşturalım
 method oluştururken - public double toplamaYap () {

 }


*/
    public static double toplamaYap(double a, double b) {
        return a + b;

    }
    //example 2: 3 sayıyı birbiriyle çarpan bir method oluşturunuz.

    public static double ucSayiyiCarp(double x, double y, double z) {
        return x * y * z;
    }

    public static double ilkIkiSayiyiToplaSonraCarp (double a, double b , double c) {
        return (a+b) * c ;
    }

}




