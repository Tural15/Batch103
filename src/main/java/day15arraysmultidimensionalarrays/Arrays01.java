package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // binarySearch () Method : Bu methos'u kullanarak bir elemanın arrayde olup olmadığını anlarız.
        // binarySearch () Method'unu kullanmadan önce Arrays.sort() kullanılmalıdır
        // binarySearch () Method'u aradığımız eleman Array'de varsa o elemanın indexini return eder.
        // binarySearch () Methodu tekrarlayan elemanlar için kullanılmaz!!!!!

        int arr [] = {12,31,43,14};

        int sayi1 = 43;
        int sayi2 = 58;


        Arrays.sort(arr); // [12,14,31,43]
        int idx1 = Arrays.binarySearch(arr,sayi1); // 3
        System.out.println(idx1); // 3 // eğer sayi 12 olsaydı cevap 0 olurdu

       int sonuc = Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc); // -5 ? ==> eksili sayı görürsek o eleman arrayde yok
                                   // eğer arrayde olsaydı 5. sırada olurdu [12,14,31,43,58] --> 5. sıra
                                   // onun için -5 sonucu verdi. başka sayılar da versek olduğu
                                   // sıraya göre sonuç verirdi
    }
}
