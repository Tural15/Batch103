package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
//        // aşağıdaki şekli ekrana yazdıran kodu yazınız
//        // ****
//        // ****
//        // ****
        Scanner input = new Scanner(System.in); // daha dinamik kod yazdık
        System.out.println("satır sayısını giriniz");
        int satir = input.nextInt();
        System.out.println("sütun sayısını giriniz");
        int sutun = input.nextInt();
        System.out.println("karakter seçiiniz");
        char c = input.next().charAt(0);
        for (int i=1 ; i<=satir ; i++){ // loop içine girdiğimizde istediğimiz gibi at koştura biliriz.

            for (int k=1;k<sutun;k++){
                System.out.print(c);
            }
            System.out.println(); // alt satıra geçtik burada. kodlar soldan sağa yukardan aşağı okunur. z

        }

        /*
         example 2: aşağıdaki şekli çizen kodu yazın
         1
         12
         123
         1234
         12345
           */

        for (int i =1;i<6; i++){
            for (int k=1;k<=i;k++){System.out.print(k+" ");} // püf nokta k<=i
            System.out.println();
        }

         /*
          example 3: aşağıdaki şekli çizen kodu yazın.
          ****
          ***
          **
          *

          */

        int row = 4;

        for (int i =1;i<=row; i++){
            for (int k =row;k>=i;k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int k =4;k>=2;k--){
            System.out.print("*"+" ");
        }
    }

}
