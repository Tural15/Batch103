package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {
        // example 1: verilen bir list'deki elemanları tekrarsız olarak yazınız.
        // [2,3,2,2,5] ---> [2,3,5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();

        for (Integer w : a) {
            if (!yeni.contains(w)) {
                yeni.add(w);
            }
        }

        System.out.println(yeni); // [2, 3, 5]

        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa o harfi List'e ekleyiniz
        // [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        // [A, K, R, S]  ==> X  ==> [A, K, R, S, X]
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        Scanner input = new Scanner(System.in);
        String harf = ""; // FLAG mantığı. dayanak noktası gibi
        do {
            System.out.println("Lütfen bir harf giriniz");
            harf = input.next().substring(0, 1);

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if (!harf.equals("Q")){
                c.add(harf);
            } // bir oyun applikasyonu olabilir mesela.

        } while (!harf.equals("Q"));  // illa i++ olmasına gerek yok do while'da

        System.out.println(c);
    }
}