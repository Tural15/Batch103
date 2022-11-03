package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //example 1: kullanıcıdan alınan sayının tek yada çift olduğunu ekrana yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        int s = input.nextInt();

        //1. yol
        if(s%2==0){
            System.out.println("çift sayı");

        }
       if (s%2!=0) {
           System.out.println("Tek sayi");   // "!="   "eşit değil" demektir.
       }
       //2. yol:
        if (s%2==0){ //% işareti mod olarak algıla
            System.out.println("çift sayı");
        } else {
            System.out.println("tek sayı");
        } // düzgün yazılabiliyorsa , if else daha pratiktir.

        //example 2: bir sayının negatif pozitive veya nötr olduğunu söyleyen kodu yazın

        System.out.println("bir sayı giriniz");
        double d = input.nextDouble();
        if (d>0) {
            System.out.println("pozitif");
        } else if (d==0) {
            System.out.println("nötr");
        } else {
            System.out.println("negatif"); // else sadece tek durum kaldığında yaza biliriz.
        } //çoklu if statementlarında ilk önce if sonra hep else if mi kullanacağız
          //en son şartta else ile yazılacak
          // if-else if-.......-else
    }
}
