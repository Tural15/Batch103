package day06nestedifswitch;

import java.util.Scanner;
//Note: Switch'de sadece int,byte,char,short,String data tipleri kullanılabilir.
//mesela boolean kullanamayız
//Eğer 3'den fazla durum varsa switch () daha çok tercih edile bilir.

public class Switch03 {
    public static void main(String[] args) {

        // KULLANICIDAN işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran
        //basit bir hesap makinesi yapınız.
        Scanner input = new Scanner(System.in);
        System.out.println("İşlemi giriniz: + , - , * , / , %");

        char islem = input.next().charAt(0);
        System.out.println("ilk sayıyı giriniz");
        double ilk = input.nextDouble();
        System.out.println("ikinci sayıyı giriniz");
        double ikinci = input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("bu işlem tanımlanmamıştır.");
        }


    }
}
