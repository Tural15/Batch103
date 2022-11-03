package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // example 1: size verilen bir integer array'deki pozitif ve negatif sayılar içeren
        // bir integer array'deki en büyük negatif ve en küçük pozitif elemanı bulunuz.

        int arr [] = {-12,18,-5,23,-2,0};
        Arrays.sort(arr);
        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1];
        System.out.println(Arrays.toString(arr)); // [-12, -5, -2, 0, 18, 23]
        for (int w : arr) { // array'deki değerleri tek tek w içine atama yapılıyor.
            if (w<0){ maxNegative = Math.max(maxNegative,w); }
            if (w>0) { minPositive = Math.min(minPositive,w);}


        }

        System.out.println(maxNegative); // -2
        System.out.println(minPositive); // 18


    }
}
