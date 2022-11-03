package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
        //example: kullanıcıdan bir dikdörtgenin en ve boyunu alıp alan ve çevresini hesaplayan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("dikdortgenin enini giriniz...");
        int en = input.nextInt();
        System.out.println("dikdortgenin uzunkenarını giriniz...");
        int uzunkenar = input.nextInt();

        System.out.println("dikdortgenin alani: " + en*uzunkenar);
        System.out.println(" dikdortgenin cevresi " + 2*(en+uzunkenar));



    }
}
