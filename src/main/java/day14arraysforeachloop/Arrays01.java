package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    // Arrays'lerin içine sadece primitive data tipleri ve reference'lar yerleştirilebilir.


    public static void main(String[] args) {
          String str [] = new String[3];
          str [0] = "Java";
          str [1] = "did";
          str [2] = "surprise you";

        System.out.println(Arrays.toString(str)); // [Java, did, surprise you]

        // example 1 : string bir array oluşturunuz ve "Tom" ve "Tom"'dan önceki tüm elemanları ekrana
        // yazdırınız

        String arr [] = {"Jane" , "Mark" , "Christopher" , "Tom" , "Ali" , "Rojda" };

        for (String w : arr) {
            System.out.print(w + " ");
            if (w.equals("Tom")){break;}
        }
        System.out.println();
        // example 2: String bir array oluşturunuz ve "Tom" ve Jane hariç tüm elemanları yazdırınız.
        String brr [] = {"Jane" , "Mark" , "Christopher" , "Tom" , "Ali" , "Rojda" };

        for (String w : brr) {
            if (w.equals("Jane") || w.equals("Tom")) {continue;}
            System.out.print(w + " ");
            }
        System.out.println();

            // example 3 : kullanıcı ile beraber bir array oluşturunuz
            //             bir öğretmenin sınıfındaki öğrencilerin isimlerini application'a yüklemesini
            //             sağlayan kodu yazınız (yukardaki teknik cümlenin günlük hayattaki karşılığı)

            Scanner input = new Scanner(System.in);
            System.out.println("Kaç öğrenci ismi gireceksiniz?");
            int numOfStudents = input.nextInt();
            String names [] = new String [numOfStudents];
        System.out.println("Girişi sonlandırmak için Q harfine basınız. Devam etmek için herhangi bir tuşa basınız");

            for (int i=1; i<=numOfStudents; i++) {
                System.out.println("Lütfen " + i + ". öğrencinin ilk ismini giriniz");
                String stdName = input.next();

                if (stdName.equalsIgnoreCase("Q")) {
                    break;
                }

                names[i - 1] = stdName;    }

        System.out.println(Arrays.toString(names));
        }



    }

