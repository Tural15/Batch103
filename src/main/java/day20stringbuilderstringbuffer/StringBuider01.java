package day20stringbuilderstringbuffer;

public class StringBuider01 {
/*
1) String Builder Java'da bir class'dır.
2) "StringBuider" String oluşturmaya yarar.
3) "String" class varken, niçin String Builder'a ihtiyaç duyarız.
   Çünkü String class "Immutable class"'dır, ama biz bazen mutable String'lere ihtiyaç duyarız.
   String Builder bize mutable String verir.
   Immutable - değişmeyen, durağan , / mutable - değişime açık
4) Immutable Class'larda varolan değer dğiştirilemez
  i) Memory'de Yeni bir variable yeni bir değerler oluşturulur.
ii) Eski variable'ın pointer'ı yeni variable'a döndürülür.
iii) Eğer bir variable'ı hiç bir pointer göstermiyorsa, o  variable "Garbage Collector" tarafından silinir.

5) Mutable class'larda varolan değer değiştirile bilir. Orijinal değer korunmaz

6) String Class'ların "immutable" yapısı security için önemlidir.
   Aynı değere sahip birden fazla String olduğunda Java bir tane container oluşturur ve aynı değere sahip
   String'lerin bu container'ı kullanmasını temin eder. Bu memory'yi korumak için iyidir ancak container'daki
   bir değeri bir variable için değiştirdiğimizde tüm variable'ların etkilenmesi tehlikesi vardır.
   Bu tehlikeden kurtulmak için String'leri immutable yani değişmez yapmıştır.
   Fakat herhangi bir variable'ın değerini değiştirmek için Java bir yol bulmuştur.
   Değiştirmek istediğiniz variable için yeni bir container oluşturur ve variable'ın pointer'ını bu yeni
   variable'a yönlendirir. Böylelikle, hem değişim sağlanmış hem de diğerleri etkilenmemiş olur.
   String yapısı bu yüzden avantajlıdır.
 */

    public static void main(String[] args) {
        String str = "Java"; // sabit burada , burada eski değer atıl kalıyor. iyi olan taraf orijina değeri koruyor.
        str = "Super Java"; // yeni kaba Super Java tanımladı.
        System.out.println(str); // Super Java

        StringBuilder strb = new StringBuilder("Java"); // değişime açık
        strb = new StringBuilder("Super Java");
        System.out.println(strb); // Super Java
        // String Builder'da kapasite kaplamadan direk String değiştirilir.

        String hesapSahibi1 = "Tom Hanks"; // hesapsahibi1 ve hesapsahibi2'nin container'ları aynı.
        String hesapSahibi2 = "Tom Hanks"; // yeni bir container oluşturmayacak hesapsahibi2 --> Java akıllı

        // String'lerin avantajı şudur ki , eski değeri korur. Banka hesabı gibi
        // Eğer String builder kullanıp Tom'u Ali'ye çevirirsek, bütün Tom'ları Ali yaparız. Patlar burada herşey

        // String Builder nasıl oluşturulur?

        // 1. yol
        StringBuilder strb1 = new StringBuilder("Java"); // Java
        System.out.println(strb1);

        // 2. yol
        StringBuilder strb2 = new StringBuilder(); // boş bir String Builder oluşturduk burada. String değil
        // Yol a:
        strb2.append ("Java"); // append ---> eklemek
        strb2.append(" is easy");
        System.out.println(strb2); // Java is easy

        // String Builder'larda append kullanırız. String'lerdeki concat() methodu gibi


        // Yol b:
        strb2.append("Learn").append(" Java earn").append(" money");
        System.out.println(strb2);

        // String Builder'larda karakter sayısı  nasıl bulunur? ---> length() methodu ile
        StringBuilder strb3 = new StringBuilder();
        strb3.append("cat");
        strb3.append("xxxxxxxxxxxxxxxxx");
        int numOfChar = strb3.length();
        System.out.println(numOfChar); // 20 ---> length() methodu ile

        int capacity = strb3.capacity();
        System.out.println(capacity); // 34 --> StringBuilder otomatikman 16 kutu açar. Kapasite aşımlarında
                                      // varolanın iki katının iki fazlasına çıkar.
         // eğer 34'ü  de geçerse bu sefer 34'ün 2 katının iki fazlası olacak --- > 70
         // capacity method ()'unun mantığı böyle.


        strb3.setCharAt(2,'r');
        System.out.println(strb3); // carxxxxxxxxxxxxxxxxx ---> t harfini r yaptık burada

        strb3.delete(2,strb3.length()-1); // son index hariçtir.
        System.out.println(strb3); // cax
        // deleteCharAt (3,18) ---> 18 hariçtir.

        strb3.deleteCharAt(2); // belli index'teki karakteri sildi.
        System.out.println(strb3); // ca

        strb3.reverse();
        System.out.println(strb3); // ac ----> String Builder'ı ters çevirdi.
                                   // String Builder direk değiştirir. en başta işlemiştik


        // "mutable"'larda sadece method kullanmak değeri değiştirmek için yeterlidir.
        // "Immutable"larda orijinal değeri değiştirmek için method kullanmak yeterli değil.
        //  bir de atama işlemi yapmalısınız.

        String abc = "Java";
        abc.replace('a','i');
        System.out.println(abc); // Java ---> çünkü atama yapmadık , yani orijinal değer değişmedi
                                 // String özelliği --- immutable ---- hatırla


        abc = abc.replace('a','i'); // atama yaptık artık burada
        System.out.println(abc); // Jivi

        // toString () method'u String Builder'ı String'e çevirir.
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3); // ac ---> String burada

        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4); // ac ---> String'den de String Builder'a geri döndük

        // 2. karakterden sonra XXX koyar yani
        strb4.insert(2,"XXXXXXXXX"); // ilk 2 karakteri atla yani boşver, sonrasına xxx ekle
        System.out.println(strb4); // acXXXXXXXXX


        strb4.insert(3,"KKKKKKK",4,5); // verilen String'in belli kısmını ekliyor.
                                                           // 4. dahil ve 5. HARİÇ karakterlerini alıyor.

        System.out.println(strb4); // acXKXXXXXXXX ---> 4. KARAKTER DAHİL 5. HARİÇ. VE KARAKTERİ 4. YERE
                                   // KOYUYOR


        StringBuilder a = new StringBuilder("Kava");
        StringBuilder b = new StringBuilder("Java");

        int sonuc = a.compareTo(b);
        System.out.println(sonuc); // alfabetik sıraya koyduğumuzda sonucu alırız ----> 1

        // i) String Builder'lar tamamiyle eşit ise sonuç 0 verir
       // ii) a alfabetik sırada b'den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir.
       // iii) a alfabetik sıralamada b'den önce gelirse negatif olarak aradaki alfabetik farkını gösterir.






    }
}
