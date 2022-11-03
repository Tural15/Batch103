package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*
        kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim = input.next();

        //1. yol
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);
        System.out.println("isim harfler: " + ilkHarf + " " + sonHarf);

        // yazdığınız kod yalnız bazı durumlar için çalışırsa o koda "Hard Coding" denir
        // defoludur yani.

        // hard kodun tersi "dynamic code"dur. her durum için geçerli olan kod.


        //2. yol
        String ilk = isim.substring(0,1); // ilk sayı (0) dahil , ikinci sayı (1) hariç***
        String son = isim.substring(isim.length()-1); // son harf olduğu için son harften sonrası yok

        // begin indeksinde yazdığımız karakterlerden sonrasını da alır.****

        System.out.println(ilk + son); // concatination- konkat etme
        System.out.println("**************");
        /*
         example 2: Aşağıdaki verilen string'deki tüm hayvan isimlerini ekrana yazdırın
          "Ben kedi eşim tavuk oğlum inek sever"
         */
        String str = "Ben kedi, eşim tavuk, oğlum sever inek";
        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34,38); //34den sonra birşey yazmazsak bile sonuna kadar alır.
        System.out.println(kedi+tavuk+inek);
        /*
         substring()'in 2 kullanımı vardır.
     1) substring(başlangıç indeksi,bitiş indeksi) - stringin ortasından bir parça almaya yarar
     2)substring (başlangıç indeksi)-string'in verilen indeksten sonuna kadar almaya yarar
         */




    }
}
