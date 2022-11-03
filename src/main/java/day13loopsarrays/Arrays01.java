package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 { // bir yapının içine çoklu data koymak.
                        // her defasında ayrı ayrı variable oluşturmaya gerek kalmaz
                        // konteynerların içine aynı tip datayı koya biliriz yalnızca
                        // bu yapılara da array denir.
    public static void main(String[] args) {
        int stdAges[]  = new int[7]; // int [] içine kaçtane data koyacağımızı yazmamız lazım.
                                    // içine kaç eleman koyacağımızı söylememiz lazım
                                    // şimdilik [0,0,0,0,0,0,0,] - integerlar için default value 0'dır.
        System.out.println(Arrays.toString(stdAges)); // arrays yazdırmak için Arrays.toString yazmamız lazım
                                                      // Arrays classına gidecez.
                                                      // toString'e bağlancaz


        // Array'lere elemanlar nasıl eklenir?
        stdAges[0] =12;
        stdAges[1] =11;// arraydeki birinci indekse gidip onu 11 yaptık
        stdAges[2] =13;
        stdAges[3] = 14;
        stdAges [4] = 10;
        stdAges [5] = 12;
        stdAges [6] = 12;
        System.out.println(Arrays.toString(stdAges)); // [12, 11, 13, 14, 10, 12, 12]

        // Array'deki herhangi bir elemanı nasıl yazdıra biliriz.
        // Arrayin tamamını görmek istemiyorum mesela
        System.out.println(stdAges[4]); //10

        // example 1. Array'deki en küçük ve an büyük elemanı ekrana yazdırın
        // ilk önce array'deki elemanları sıralayacaz
        Arrays.sort(stdAges); // küçükten büyüğe dizeriz böylece. ---> Arrays.sort
        System.out.println(Arrays.toString(stdAges)); // [10, 11, 12, 12, 12, 13, 14]
        int ilk = stdAges[0]; // en küçük
        int son = stdAges [stdAges.length-1]; // en büyük --- stdAges.length-1 --- dinamik kod
        System.out.println(ilk+son); // 24
        // length () --> Stringlerde kullanılır
        // length array'lerde kullanılır

        // Example 2 : stdAges içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız
        // 1. yol
        int sum = 0;
        for (int i =0 ; i<stdAges.length ; i++){
            sum = sum + stdAges[i]; // length her zaman son indeks sayısında 1 fazladır.
                                    // length eleman sayısını verir
        }
        System.out.println(sum);

        // 2. yol.
        int sum1 = 0; // yeni variable oluşturduk. eski sum'ı kullansak farklı sonuç alırız
        int i = 0;
        while (i<stdAges.length){
            sum1=sum1+ stdAges[i];
            i++;
        }
        System.out.println(sum1);

        // 3. yol - do while ile
        int k =0;
        int s = 0;
        do {
            s = s+stdAges[k];
            k++;
        } while (k<stdAges.length);
        System.out.println(s);

        // 4. yol.---> for each loop--->en gelişmiş loop'dur.--- > array'ler ve collections'larda kullanılır
        // bazen for , while veya do while'la da çözeriz işi

        // ilk yazılacak şey data tipidir. w genelde kullanılır variable ismi olarak.
        // sonra array'in ismi yazılır.
        int t = 0;
      for (int w: stdAges){
         t=t+w;
      }
        System.out.println(t);
        // bütün elamanlar bitince loop kırılacak

        // example 3: String bir array oluşturun. bu array'e beş tane yerleştirin.
        // sonra bu isimlerdeki karakter sayıları toplamını yazdırınız.

        String stdNames [] = new String[5];
        stdNames [0] = "Ali";
        stdNames [1] = "Tom";
        stdNames [2] = "Veli";
        stdNames [3] = "Kemal";
        stdNames [4] = "Cem";
        int toplam = 0;
        for (String w : stdNames){
            toplam = toplam+ w.length();
        }
        System.out.println(toplam);

        // example 4: Char bir array oluşturunuz. sonra bu array'e 5 eleman ekleyiniz
        // bu array'deki sadece büyük harfleri ekrana yazdırınız.

        char ch[] = { 'A' , 'c' , 'D' , 'k' , 'M'}; // süslü parantezle de array oluştura biliriz.
                                                    // en kısa yolu bu.

        for (char w : ch){
            if (w>='A' && w<='Z'){System.out.print(w);} // ADM
        }

    }
}
