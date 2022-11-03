package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    // scanner kullanıcıdan data almaya yarar. Scanner kullanıcı ile etkileşim kurmamızı sağlar.
    // Scanner bir Java Class'ıdır.
    //Scanner class'ı Java'nın util kütüphanesindedir.


    public static void main(String[] args) {

        // scannerler dışardaki datayı benim kodumun içine taşır.
    // Java'nın içinde bir sürü Library'ler var. ilk önce util kütüphanesini kullanacağız.
        // Kullanıcıdan data almak için bütün aksiyonları Scanner'ın içine koymuş.

        // Scanner da bir class'dır.
        // Scanner'ın içinde hem variable hem de method'lar vardır.
       // kullanıcıdan data almak için yapılması gerekenler
        /*
        1. adım : Scanner class'ında obje oluşturun.
        2. adım: kullanıcıya mesaj vereceğiz. kullanıcıya ne yapacağını söylemem lazım
        System.out.println("hey kullanıcı yaşını gir" gibi);
        3. Adım : Kullanıcıdan aldığınız datayı bir variable'ın içine koyun


         */

        Scanner input = new Scanner (System.in); // sistemin içine birşey koymak istiyorum demek

        System.out.println("Hey kullanici yasini gir...");// sistemin dışına birşey yolluyor.

        byte age = input.nextByte();

        System.out.println("Hey Kullanici senin yasin " +  age);




    }


}
