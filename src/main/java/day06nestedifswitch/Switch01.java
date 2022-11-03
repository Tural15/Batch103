package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        kullanıcıdan gün sayısını alınız ve gün ismini siteme yazdırınız
        1 - pazar , 2 - pazartesi, 3-salı, 4 - çarşamba , 5 - perşembe, 6-cuma, 7 - cumartesi
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz");
        int gunNo = input.nextInt();
        if (gunNo ==1){
            System.out.println("Pazar");
        } else if (gunNo==2) {
            System.out.println("Pazartesi");

        }else if (gunNo==3) {
            System.out.println("salı");

        }else if (gunNo==4) {
            System.out.println("Çarşamba");

        }else if (gunNo==5) {
            System.out.println("perşembe");

        }else if (gunNo==6) {
            System.out.println("cuma");

        }else if (gunNo==7) {
            System.out.println("cumartesi");

        }else {
            System.out.println("Geçerli bir numara giriniz");
        }
        System.out.println("**********************");

        // 2. yol: switch ile çözünüz
        switch (gunNo){
            case 1:
                System.out.println("Pazar");
                break; // mola verdiriyoruz.
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("çarşamba");
                break;
            case 5:
                System.out.println("perşembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default: // yukarıda verilen durumlar dışında bir mesele varsa default yazarız
                System.out.println("Geçerli gün sayısı giriniz"); // burda break yok
        }

// doğru bilgiyi yakaladığı zaman breaK'le dışarı atar seni. yani bilgiyi yazdırır.
// break olmazsa , mesela salı  ve çarşambada break olmazsa, 3 yazarsak, salı çarşamba ve perşembeyi görürüz
// not: toLowerCase () methodu bir String'deki tüm karakterleri küçük harfe çevirir.
    }
}
