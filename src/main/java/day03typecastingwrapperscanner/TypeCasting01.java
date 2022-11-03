package day03typecastingwrapperscanner;

public class TypeCasting01 {
    //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
//              byte < short < int < long < float < double

//Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
//Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" (açık daraltma) denir

    public static void main(String[] args) {
        byte age = 23;
         int newAge = age;

         long population = 1234;
         int newPopulation = (int) population;

         // açık daraltma olduğu için özellikle (int) belirttik burada.
        //büyük kapasiteyi küçük kapasitenin içine koymak mümkün değildir.
        // onun için açık seçik (int) belirttik. - açık seçik daraltma - kapiş

        // example 1:  short'u dotuble'a çeviren kodu yazınız
        //        // example 2: float'ı bye yapan kodu yazınız.

        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents; // Auto Widening

        float price = 12.99f;
        byte newPrice = (byte) price; // Explicit Narrowing

        System.out.println(newPrice);
        /*
         yazdırınca 12.99'u 12 gösterdi. Java ondalık sayıyı tam sayıya çevirirken,
         yuvarlama işlemi yapma. Java ondalık sayıyı tam sayıya çevirirken ondalık kısmını siler.
         */

        int number = 515 ;
        byte newNumber = (byte) number;
        System.out.println(newNumber); // ekranda 3 gösterdi.

        // byte: -128'den 127'e kadar. bu aralıkda 256 adet sayı var. 515'i 256'a böldüğümüzde 3 kalan verir.
        // bu sonucu da return etti.
        // büyük kutuyu küçük kutuya yerleştirmeye çalışırsak garip sonuçlar elde biliriz.
        //onun için pek de kullanışlı bir şey değil Explicit Narrowing.

        int num = 510;
        byte newNum = (byte) num;
        System.out.println(newNum); // ekranda -2 gösterdi. byte aralığındaki sayıyı gösterdi. mantık aynı
                                    // 510'u 256'a böldüğümüzde mod eksi 2 bilgisi verir.



    }


}
