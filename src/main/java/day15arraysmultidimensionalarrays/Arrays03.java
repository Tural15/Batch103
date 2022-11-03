package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
    // example 1 : bir string'deki sesli harflerin sayısını bulan kodu yazınız.
        // a - e - i - o - u
        //A - E - I - O - U

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str = str.toLowerCase();
        String harfler[] = str.split(""); // burada boşluk olmadan böldük--> [J, a, v, a,  , o, g, r, e, n,...
        int counter = 0;
        System.out.println(Arrays.toString(harfler));
        for (String w : harfler){
            switch (w){
                case "a" :
                case "e":
                    case "i" :
                        case "o" :
                            case "u":
                    counter++;
                    break;
            }
        }
        System.out.println(counter);


    }
}
