package day04ifstatement;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Scanner01 {
         /*
            Kullanicidan ilk, orta ve soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mert Can
            123456789
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next(); // next methodu kullanıcıdan String datası almak için kullanılır.
        System.out.println("Enter your middle name");
        String middleName = input.next();
        System.out.println("Enter your surname");
        String surname = input.next();
        System.out.println("Enter your ID number");
        String idNumber = input.next();
        System.out.println(firstName +" " + middleName +" " + surname);
        System.out.println(idNumber);

        /*
        2. yol: sout ("ilk orta ve soyisminizi giriniz")
         */
        System.out.println("ilk orta ve soyisminizi ve kimlik no'su giriniz");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next(); // next kullanıcının girdiği ilk kelimeyi alır
        String kimlik = input.next();
        System.out.println(ilk +" "+orta+" "+ soy);
        System.out.println(kimlik);

        /*
        3. yol:

         */

        System.out.println("Ilk,orta ve soyisminizi giriniz");
        String tamIsim = input.nextLine(); // kullanıcının girdiği bütün String'i baştan sona alır.
        System.out.println(tamIsim); // eğer next olsaydı mesela bilge ece yazsaydım ekrana sadece bilgeyi atacaktı.
        System.out.println("kimlik no girin");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);

    }

}
