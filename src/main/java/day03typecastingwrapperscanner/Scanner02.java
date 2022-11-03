package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        // example 1: sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız.
        // 1 . adım: Scanner Class'ından obje oluşturucaz
        // 2. adım: Kullanıcıya mesaj vereceğiz.
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz...");
        double num1 = input.nextDouble(); //konsolda girilen sayıyı num1'e tanımladı
        System.out.println("ikinci sayiyi giriniz...");
        double num2 = input.nextDouble(); // dışardan girilen sayıyı içeriye alıp değişkene tanımladı.

        System.out.println(num1 + num2); // yukardaki her iki sayıyı içeride değişkenlere tanımladıktan sonra,
                                         // dışarıya sonucu yansıtıyor.


    }


}
