package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
         // example 1: Kullanıcıdan bir sayı alınız. sayı 100'den küçük ise ekrana "Kazandın" yazdırın.
        // aksi halde ekrana "Kaybettin" yazdırın. Kullanıcı kazandıkça oyun devam etmeli
        Scanner input = new Scanner(System.in); // bu örnek mayın oyununa örnek
        int sayi = 0; // dışarıda bir variable tanımladık. herhangi bir değer de ataya bilirdik.
                      // zaten içeride biz değer oluşturuyoruz.
       do {
           System.out.println("Bir sayı giriniz");
           sayi = input.nextInt();
           if (sayi<100){System.out.println("Kazandınız");}
       }
        while (sayi<100);
        System.out.println("Kaybettiniz");

        // example 2: kullanıcıdan ismini alınız ilk harfinin büyük olup olmadığını kontrol ediniz.
        do {
            System.out.println("İsminizi giriniz");
            char ilkHarf = input.next().charAt(0);
            if ( ilkHarf>='A' && ilkHarf<='Z'){System.out.println("İsmi başarıyla girdiniz");}
            else {System.out.println("Yalnış bilgi girdiniz için iptal edildi ");break;}
        } while (true); // true yazmamızın nedeni, condition true olarak yazarız.
                        // loop'u çalıştırmamız için true yazdık.
                        // sonsuz loop break'le kırılır.
                        // break bizi loop'un dışına atacak yani loop kırılmış oldu.

        // Infinite loop  - sonsuz döngü
        // sonsuz döngü bilgisayarlar için tehlikeli.

//        for (int i =1;i<4;i--){System.out.println("Hi");} // sıkıntılı burası

//        for (int i =1;i<4;  ){System.out.println("Hi");} // yine sıkıntılı. sonsuz loop

//        int i = 12;
//        while (i<15){System.out.println("Hi");}
        // devamında increment veya decrement olmadığı için infinite loop oluşur.
        // ve sorunsal oluşur.



    }
}
