package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        ArrayList'ler aynı data tipine sahip birden fazla datayı depolamak için kullanılır.
         Array ile ArrayLİst'in farkı:
         1) Array oluştururken Array'in içine kaç tane eleman koymamız gerektiğini söylemeliyiz ve söylediğimiz
         eleman sayısından fazla eleman koyamayız
         Array'ler eleman sayısında fixed'dir. bu da problem oluşturur çoğunlukla

         2) ArrayList'leri oluştururken eleman sayısı söylemeye gerek yoktur. Çünkü ArrayList'ler
         eleman sayısında flexible'dırlar. esnekdirler.
         2) Array'lerin içine primitive ve referance'ler konulabilir.
            ArrayList'lerin içine ise sadece non-Primitive'ler konulur. (Wrapper class'lar gibi -- Integer vs)
         3 ) Array'ler super fast'dir. Array'ler memoty'yi çok az kullanır.
            Uzunluğundan (eleman sayısı belli olan, mesela haftanın 7 gün olması gibi)emin
            olduğumuz verilerde Array kullanmak en iyisi.
            Uzunluğu belli olmayan durumlarda Array List kullanmak gerek
            */

        // ArrayList nasıl oluşturulur?
        // 1. yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        // 2. yol:
        ArrayList<Integer> heights = new ArrayList<>(); // ister Integer yazalım ister yazmayalım farketmez
        // 3. yol:
        List<Integer> nums = new ArrayList<>(); // böyle de olabilir.
        // Genelde 2. ve 3. yol izlenir.

        // ArrayList'ler nasıl yazdırılır?
        System.out.println(nums); // [] ----> boş list ---- > daha gelişmiş

        // ArrayList'lere nasıl eleman eklenir?

        nums.add(21); // .add işlemiyle eklemek gerek ve bu da sırasıyla ekler (insertion order)
        nums.add(18); //  sırayla elemanı dizer.
        nums.add(20);
        System.out.println(nums); // [21, 18, 20]

        nums.add(1, 50); // [21, 50, 18, 20]
        System.out.println(nums); // burada 1. indekse 50 sayısını sıkıştırdık.
        // .add method'u boolean return eder.

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums); // [21, 50, 18, 20, 23, 185]
        System.out.println(prices); //  [23, 185]

        nums.addAll(2, prices); // 2. indekse prices eklendi.
        System.out.println(nums); // [21, 50, 23, 185, 18, 20, 23, 185]

        // ArrayList'deki eleman sayısı nasıl bulunur?
        int elemanSayisi = nums.size(); // .size method'u kullandık burada (List'lerde)
        // Array'lerde length kulanırız.

        System.out.println(elemanSayisi); // 8

        // Array'lerde herhangi bir eleman nasıl seçilir?
        int el1 = nums.get(3); // .get method'u istenen bir indeksdeki elemanı verir.
        System.out.println(el1); // 185

        // ArrayList'in boş olup olmadığını nasıl anlarız.
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1); // false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2); // true

        // ArrayList'de bir eleman nasıl değiştirilir? --> 185i 200 yapacaz mesela

        nums.set(3, 200);
        System.out.println(nums); // [21, 50, 23, 200, 18, 20, 23, 185]
        // 3.  indeksteki sayıyı 200 yaptı.

        // example 1 : nums ArrayList'indeki tüm tek sayıları 11 artırdıkdan sonra, ekrana yazdırınız

        for (int w : nums) {
            if (w % 2 != 0) {
                nums.set(nums.indexOf(w), w + 11); // 21'in nums'daki indeksi , 21+11=32
            }
        }



        System.out.println(nums); // [32, 50, 34, 200, 18, 20, 34, 196]
        // Example 2: ArrayList'den 200 elemanını siliniz.
        // tüm tam sayılar Java için aksi söylenmedikçe primitive'dir. yani int'dir
        //

        Integer sayi = 34; // indeksten bağımsız olarak 34 elemanını sildik burada. ama ilk göründüğü yeri

        nums.remove(sayi); // remove methodu sadece elemanın ilk GÖRÜNÜM'ünü siler
        // remove method'unun içine tam sayı koyarsanız Java onu indeks olarak kabul eder.
        // primitive'ler ArrayList'lerin elemanı olamazlar.
        // List'ler non-primitive depolar çünkü
        // Primitive'i wrapper class'a çevirirsek non-primitive olur
        // Non - primitive'ler ArrayList'lerin elemanı olur. indeks olamaz.

        System.out.println(nums); // [32, 50, 200, 18, 20, 34, 196]


    }
}
