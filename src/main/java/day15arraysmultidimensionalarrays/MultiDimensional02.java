package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensional02 {
    public static void main(String[] args) {
        // Multidimensional array oluşturmanın kısa yolu:

        char arr [][] = { {'a','b'} , {'C','D','E'} , {'?'} };
        System.out.println(Arrays.deepToString(arr)); // [[a, b], [C, D, E], [?]]

       // bir string multidimensional array'de içinde "a" olan elemanları yazdırınız.

        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for ( String [] w  : brr  )  {
            for (String k : w) {
                if (k.contains("a")){System.out.print(k + " ");}

            }

        }


    }
}
