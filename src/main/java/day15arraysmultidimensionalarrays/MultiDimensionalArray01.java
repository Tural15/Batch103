package day15arraysmultidimensionalarrays;

// arrayin içine de array koyma
// bir arrayin elemanları array ise bu arrayler multidimensional arraydir.


import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        // nultidimensional array nasıl oluşturulur?
         int arr [][] = new int[3][2]; // içerdeki arraylerin içinde de 2 eleman var
        // multidimensional array'lere eleman nasıl eklenir?

        arr [1][0] = 6;
        arr [0][0] = 3;
        arr [0][1] = -4;
        arr [1][1] = 18;
        arr [2][0] = -7;
        arr [2][1] = 0;
        System.out.println(Arrays.deepToString(arr)); // burada deeptoString kullanıyoruz
                                                      // [[3, -4], [6, 18], [-7, 0]]

        // Multidimensional array'lerde array elemanlarından biri nasıl yazdırılır?

        System.out.println(Arrays.toString(arr[1])); // [6, 18] -- array yazdırmak farklı

        // multidimensional array'lerde iç array'lerdeki elemanlar nasıl yazdırılır?

        System.out.println(arr[1][0]); // 6; ---> rakam yazdırmak farklı

        // example 1: String bir multidimensional array oluşturunuz.
        //           elemanları ekleyiniz,sonra toplam eleman sayısını ekrana yazdıran kodu giriniz

        String brr [][] = new String[4][3];
        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";
        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";
        brr [2][0] = "G";
        brr [2][1] = "H";
        brr [2][2] = "I";
        brr [3][0] = "J";
        brr [3][1] = "K";
        brr [3][2] = "L";
        System.out.println(Arrays.deepToString(brr)); // [[A, B, C], [D, E, F], [G, H, I], [J, K, L]]
        int sum = 0;
        for (String [] w : brr) { sum = w.length + sum; }
        System.out.println(sum); // 12





    }
}
