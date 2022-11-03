package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
     // example 1: [0,2,3,0,12,0] sıfırları en sona koyunuz
        // [2,3,12,0,0,0,]

        int original [] = {0,2,3,0};

        int yeni [] = new int[original.length];
        int idx = 0;

        for (int i = 0 ; i<original.length ; i++) {
            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;}
        }
        System.out.println(Arrays.toString(yeni));

        // example 2: bir arrayin içinden herhangi bir elemanın olup olmadığını
        // ve kaç kere tekrarlandığını kontrol eden kodu yazınız
        // [2,1,2,-3,2] ==> kullanıcı 2.yi sordu ==> 2 elemanı var ve 3 kere tekrarlandı
        //              ==> kullanıcı 6'yı sordu == 6 elemanı yok ve 0 kere tekrarlandı

        int arr []= {2,1,2,-3,2};
        int eleman = 2;
        int counter =0; // "flag"-bazı durumların olup olmadığını kontrol etmek için flag kullanılır.
        for (int w : arr){
            if (w==eleman){counter++;} // w== eleman burada arrayin içinde olması anlamı taşır.
        }

        if (counter>0) {
            System.out.println(eleman + " array'de "+counter+" defa var.");
        } else {System.out.println(eleman + " array'de yok");}

        // example 3: size verilen bir cümledeki en uzun kelimeyi bulan kodu yazın
        // "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana

             String sentence =  "Java kolaydir calisana, ne kolay ki calismayana.";
             sentence=sentence.replaceAll("\\p{Punct}","");
             System.out.println(sentence);

        String words []= sentence.split(" "); // parçalayıp array oluşturduk burada
        Arrays.sort(words, Comparator.comparingInt(String::length));   // sort array comparator
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);

    }
}
