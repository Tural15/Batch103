package day01variables;



public class Variables01 {

    //Variable nasıl oluşturulur?
 //1)Access Modifier(kimler datayı göre bilir diye) 2)Data Type 3)Variable ismi 4)=  5)Değer 6);

    public int age = 13;
     public int height = 183;

     //access modifier ve data tipi arasında boşluk olmalı. diğerleri için de geçerli
     //JAVA'daki ";" ingilizcedeki "." yani nokta gibidir.
     //ingilizcede cümle deriz. JAVA'da statement deriz.
     //proje oluşturduktan sonra src'nin altındaki main kısmından package açıp isim veririz.
     //sonra o package'da class oluştururuz
     //buradaki "=" assignment operator. yani değeri değişkene tanımlar.

                        //JAVA'da data tipleri
    //1) int (integer) - tam sayı - 32 bit kullanır
    //Matematikte tam sayıların başı ve sonu yoktur.
    //Java'da tam sayıların başı ve sonu vardır.
    //en küçük int  =  - 2.147.483.648
    //en büyük int = 2.147.483.647
    // memory'yi tasarruflu kullanırsak , application daha hızlı olur

    // 2) byte data tipi - tam sayılar için kullanılır. int'ten farkı - 8 bit kullanır
    // en küçük byte = -128
    // en büyük byte = 127

    public byte price = 12;

    //byte genelde okul application'ında kullanılır

    //3) short : Tamsayılar için - 16 bit kullanır
    // en küçük short = -32768
    // en büyük short = 32767

    public short populationOfVillage = 23000;

    // long : Tamsayılar için - 64 bit kullanır
    // long int'in yetmediği yerde kullanılır. mesela dünya nüfusu için long kullanılır.

    // memory'yi tasarruflu kullanmak lazım.

    // 5 ) float : ondalıklı sayılar içindir. 32 bit kullanır
    // float virgülden sonra yedi basamak içerebilir

    // 6) double : ondalıklı sayılar içindir. 64 bit kullanır
    // "double" virgülden sonra 16 basamak içerebilir.

    // float değerlerinde sona küçük f veya F koymanız gerekir. pek kullanışlı değil .
    //ondalıklı sayılar için genelde double kullanılır.

    public float priceOfShirt = 13.99f;
    public double weightOfCell = 0.000012045;
    public long populationOfWorld = 7000000000L;

    // siz long demenize rağmen JAVA verilen sayıyı "int" kabul eder. SONUNa "L" koymamız lazım.
    // verdiğimiz sayı int'e uymadığı için sonuna "L" koymamız gerekiyor. ama pek bir kullanımı yok long'un


  // 7) boolean ; günlük hayatta doğru veya yanlış değerleri için kullanılır. 1 bit kullanır

    public boolean isOld = true;
    public boolean isRich = false;

    // 8) char: tek karakterler için kullanılır. a , C , 2 , ? gibi. 16 bit kullanır.
    // char'lara değer verirken değeri tek tırnak arasına koyunuz. yoksa hata verir.
    // JAVA küçük ve büyük harflere duyarlıdır. true ve True farklıdır.


    public char initial = 'S' ;

    // Note: byte < short < int < long
    // float < double

    // bu öğrendiğimiz 8 data tipi primitive (basit) data tipleridir. primitive'lerde sadece bir değer vardır.



    // Non-primitive data types: içinde değer de vardır. methodlar da vardır.
    //Data tipi String ise mutlaka çift tırnak arasına alınır değerler." "
    // String : isim adres kimlik numarası gibi bir veya birden fazla karakter için değerlerde kullanılır.
    //String non-primitive'dir.
    // bir String oluşturduğunuzda JAVA size bir sürü method verir.
//1) non-primitive data tiplerinde değerin yanında metodlar vardır. primitivce'lerde ise sadece değer vardır. metod yoktur.
//2) primitive data tipleri Java tarafından oluşturulmuştur. toplam 8 tanedir.
    // biz primitive data oluşturamayız

// non primitive'ler Java tarafından da oluşturulmuştur. biz de oluştura biliriz.
// non-primitive'ler sayılamayacak kadar çoktur. her developer non-primitive data tipi oluştura bilir.
// primitive data tipleri isimlendirilirken küçük harflerle isimlendirilirler.
    // non-primitive'ler ise büyük harfle başlar.
    //class isimleri büyük harfle başladığı için non-primitive'dir.
    //primitive data tipler memoryde farklı büyüklükde yerler kullanır.
    // non-primitive'ler hepsi memoryde aynı büyüklükte yer kullanırlar.


    public String name = "Tom Hanks" ;

    public static void main(String[] args) {

        // main method arabanın motoru gibidir. main method olmadan hiçbir şey çalışmaz
        //şimdiye kadar sadece değişkenleri tanımladık.
//psvm main methoddur. psvm'den öncekiler methodlardır.
      int num1 = Integer.MAX_VALUE;
        System.out.println(num1);
    }
   }
