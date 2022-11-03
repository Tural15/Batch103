package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        // example 1: bir integer array list'deki 7 hariç tüm elemanları 2 artırınız
        List<Integer> ages = new ArrayList<>();
        ages.add (12);
        ages.add (7);
        ages.add (21);
        ages.add (78);
        ages.add (9);

        for (Integer w : ages ) {
            if (w==7){ continue; }
//            w = w+2 ; List'ler böyle değiştirilemez. set() method'uyla değiştirilir
            ages.set(ages.indexOf (w) , w+=2);

        }
        System.out.println(ages);


        // example 2: size verilen list'de 8 ve 8'den önceki tüm
        // elemanları 2 katına çıkarınız

        List<Integer> nums = new ArrayList<>();
        nums.add (12);
        nums.add (7);
        nums.add (21);
        nums.add (8);
        nums.add (9);

        for (Integer w : nums) {

            if (w>8) { continue; }

            nums.set(nums.indexOf(w) , w*=2);

        }
        System.out.println(nums);

    }
}
