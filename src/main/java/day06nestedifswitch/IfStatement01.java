package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*
        Kullanıcıda yaş değerini alankodu yazınız ve yaşın hangi evrede olduğunu
        aşağıdaki tabloya göre ekrana yazdırınız.
        0-4 ==> bebek
        5-12 ==> çocuk
        13 - 20 ==> genç
        21-30==> yetişkin


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = input.nextInt();
        if (yas<0){
            System.out.println("Geçerli yaş giriniz");
        } else if (yas<5) {
            System.out.println("bebek");
        }else if (yas<13){
            System.out.println("çocuk");
        } else if (yas<21) {
            System.out.println("genç");
        } else if (yas<31) {
            System.out.println("yetişkin");
        } else {
            System.out.println("Tanımlanmamış evre");
        }
      // mümküm olduğunca sade kod yazmak gerek!!!!
        // boolean mantığıyla çalışır.
        // Boundary Valve Analyze Test (BVA): Sınır değeri analiz testidir.
        // Kritik değerleri,öncesini ve sonrasını test etme yönteminin ismidir.

        System.out.println("*******************");



    }
}
