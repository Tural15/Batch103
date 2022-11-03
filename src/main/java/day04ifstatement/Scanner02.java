package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    /*
    char variable'ları matematiksel işlemlerde kullanırsanız Java onlarn ASCII değerlerini kullanır.
    örneğin, sout('A'+'C') ekrana AC yerine MATEMATİKSEL DEĞERİNİ yazdırır

    Java'da + sembolünün 2 anlamı vardır. birinci anlam toplama işlemi. ikinci anlamı birleştirme işlemi
    Java + sembolü görünce önce toplama yapmaya çalışır. yapamazsa birleştirme (concatination)
    işlemi yapmaya çalışır.
    o da olmazsa hata verir.

     */

    public static void main(String[] args) {
        /*
        example 1 : kullanıcıdan ilk ve soyismini alınız. İlk ve soyismin ilk harflerini ekrana yazdırınız.
        Ali Can ----- AC
         */
        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        char ilk = input.next().charAt(0);

        /*input.next() bana Ali'yi verdi.
        Ali
        012
        ilk karakteri istediği için paranteze 0 indeksini yazdık. eğer ikinci karakter istenseydi 1 yazardık
        Cemre
        01234
        mesela: dördüncü harfi isteseydi yani r harfini isteseydi paranteze 3 indeksini yazacaktık

        */

        System.out.println("soyisminizi giriniz");
        char soy = input.next().charAt(0);


        System.out.println(ilk + soy);

        System.out.println("" + ilk + soy);

       /*
       charlar ASCI değerlere sahiptir. onun için ilk harflerin ASCI değerlerini topladığı için
       abuk subuk sonuç çıktı.
       eğer soutta char'ların arasına matematiksel işlem yapılırsa ASCI değerleri toplar.
        */


        /*
         Javada + işaretinin anlamı ya toplama yada birleştirmedir. ilk önceliği matematikseldir.
         eğer toplayamazsa birleştirir. Birleştirmenin sonucu String olur
        başa çift tırnak koyarsak "" o zaman Stringle char'ı birleştirdiğimizde
        sonuç String olur.

         */

     // 2. yol.

        System.out.println("tam isminizi giriniz");
        String tamIsim = input.nextLine();
        char ilkHarf = tamIsim.charAt(0);

        /*
        Ali Can
        0123456
         */
        System.out.print(ilkHarf);
        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0)     ;

        /*
        split'de isimle soyismi ayırdı.
        Ali Can
        split " " yaptığımızda boşluktan sonra Can'ı parçaladı. Can burada [1] indeksinde olur. Ali ise [0]
        sonra [1] indeksindeki ilk indeksi yazarsak alır.

         */

        System.out.println(soyIsminIlkHarfi);


    }

}
