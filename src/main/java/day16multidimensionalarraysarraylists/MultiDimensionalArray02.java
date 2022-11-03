package day16multidimensionalarraysarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        // example 1 : bir multidimensional array'deki en büyük ve en küçük
        // elemanın toplamını veren kodu yazınız

        int arr [] [] = { {2,5,1},  {83,75} };
        int maxElement = arr [0][0];
        int minElement = arr [0][0];

        for (int [] w :arr) {
            for (int k : w){ maxElement = Math.max(k,maxElement); }
            for (int l : w){ minElement = Math.min(l,minElement); }
        }

        System.out.println(maxElement); // 83
        System.out.println(minElement); // 1
        System.out.println(maxElement+minElement); // 84

    }
}
