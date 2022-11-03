package day16multidimensionalarraysarraylists;


import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        // bir tane multidimensional array oluşturunuz ve
        // bu array'deki tüm sayıların toplamını veren kodu yazınız

        int arr[][] = { {2,5,1}, {32,75}, {13,21,43,56}};
        int sum = 0;

        for (int []w: arr) {
            for (int k : w){sum = sum + k;}
        }
        System.out.println(sum);


        // example 2 : bir multidimensional array'i normal array'e çeviren kodu yazınız
        // { {2,5,1}, {32,75} } ==> {2,5,1,32,75}

       int brr [] [] = { {2,5,1},  {32,75} };
       int toplam = 0;
       int idx =0;
       for (int [] w: brr) {toplam =toplam + w.length;} // yeni arraydeki eleman sayısını bulmak için yaptık-5
        System.out.println(toplam);

       int crr []= new int [toplam];

       for ( int [] w:brr) {

           for (int k : w ) {
               crr [idx] = k;
               idx++;
           }
       }
        System.out.println(Arrays.toString(crr)); // [2, 5, 1, 32, 75]

    }

}



// Array veya Collection varsa for each loop kullanmak ilk tercihimiz olsun
//Array veya Collection var ama "index" kullanmak zorundasınız, o zaman for loop veya while veya
// do while kullanırız

