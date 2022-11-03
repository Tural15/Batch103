package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {
        /*
        ingilizcede if eğer demektir.
        If it rains, I will cancel the picnic.
        şart bölümü - sonuç bölümü
        şart doğru (true) olursa sonuç kısmı aktive olacak
        şart doğru olmazsa (false) sonuç kısmı deactive olacak
           bu mantığı Java kodda kullanmış

           if statement'ları belli kodları belli şartlara bağlı olarak çalıştıracaktır.
          application'lar özellikle if statement'larına bağlı olarak çalışır.


         */


        // Example1: sayı pozitif ise ekrrana pozitif yazdırın
        int s = 12;
        if  (s>0){
            System.out.println("positive");


        }


        // example 2 : verilen karakter büyük harf ise ekrana büyük harf yazdırın

        char ch = 'S';
        if (ch>='A' && ch<='Z') {

            System.out.println("Buyuk Harf");
            /*  && işlemi sadece boolean ile kullanılır (true or false mantığı). yani && işleminde yazılan her
            koşulun true olması lazım. biri bile false olsa kod çalışmaz
            bütün koşullar true olmalıdır.
            */

            // Example 3: verilen bir sayı 3 basamaklı ise ekrana üç basamaklı yazdırınız.

            int n = -555;
            n = Math.abs(n); // abs - absolute value - mutlak değer

            if (n>99 && n<1000) { //büyük eşit veya küçük eşit yaptırırsak Java 2 iş yapar ve Java kastırır.
                System.out.println("Uc Basamakli");

                // example 3: verilen sayı çift ise ekrana çift sayı yazdırınız

                int num = 15; // % ---> Mod  ; yani 14 % 2 ---> 0

                if (num%2==1){
                    System.out.println("tek sayi");
                    // = işareti atama operatörüdür. matematikteki eşittir anlamına gelmez.
                    // matematikteki = işareti ise == olarak yazılır.
                }
              // example 5: verilen bir sayı 300'den küçük veya 1200'den büyük ise ekrana harika sayı yazdırın
                int r = 250;
                if (r<300 || r>1200){
                    // || işareti  Javada veya anlamı içerir
                    // her iki durum da doğru olacak diye bir kaide yok.
                    // ikisinden biri doğru olsai kod çalışır
                    // || (veya) işlemi boolean mantığıyla çalışır.

                    System.out.println("harika sayi");
                }


            }
        }
    }
}
