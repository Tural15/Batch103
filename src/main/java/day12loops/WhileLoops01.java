package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        // Example 1 : 3den 10a kadar tam sayıları aynı satırda ekrana yazdıran kodu yazın
        // 1. yol
        for (int i=3;i<11;i++){System.out.print(i+" ");} // loop'larda hep aynı format vardır.
        System.out.println();

        // 2. yol
        int i = 3; // for loop'la arasında syntax farkı var. başka da birşey yok
        while (i<11){ // başlangıç değerini dışarıya yazdık
            System.out.print(i+" ");
            i++; // for loop'daki üçüncü parametreyi içeriye yazdık. for loopdaki gibi sona yazdık
        } // while daha okunur bir method.

        //example 2: 17den 4e kadar tüm çift sayıları ekrana yazdıran kodu yazdırın
        System.out.println();
        int t = 17;
        while (t>3){
            if (t%2==0){System.out.print(t+" ");}
            t--;
        }

        System.out.println();

        int sum = 0;
        int n = 12;
        while (n<16){ sum=sum+n; System.out.print(sum+" "); n++;}
        System.out.println();

        //example 4: size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız
        Scanner input = new Scanner (System.in);
        // Kullanıcıdan bir sayı alınız
        int k = input.nextInt();
        int sum1 = 0;
        while (k>0){
            sum1 = sum1+k%10;
            k/=10;
        }
        System.out.println(sum1); // toplam sonucu aldım burda
        System.out.println();

         // example 5 : kullanıcıdan aldığımız bir sayının çarpım tablosunu ekrana yazdırın
        // 3 --> 3*1=3 ..... 3*10=30
        System.out.println("çarpım tablosunu görmek için sayı giriniz");
        int s = input.nextInt();
        int d =1;
        while (d<11) {

            System.out.println(s+"x"+d + "=" +  s*d);

         d++;
        }
    }
}
