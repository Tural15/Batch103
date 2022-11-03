package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

        //1.Way: if-else
        int a = -12;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }

        //2.Yol: ternary
        //Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc =     a>0      ?           "Pozitif"                    :            "Pozitif degil";
        System.out.println(sonuc);

        // ternary bize string verdiği için String data tipini kullandık. çıktı neyi verirse o data tipini kullan

        // example 2 : iki sayıdan küçük olanı seçen kodu yazın.

        int b = 120;
        int c = 23;

        int min = b<c ? b : c ;
        System.out.println(min);

        // example 3: verilen bir sayının mutlak değerini hesaplayan kodu yazınız.
        // pozitif sayıların ve 0'ın mutlak değeri kendileridir.
        //negatif sayıların mutlak değeri, -1 ile çarpılmış halleridir.

        int d = -45;

       int absoluteValue = d<0 ? -1*d : d;
        System.out.println(absoluteValue);

        /*
         example 4: iki sayı aynı işaretli ise bu sayıları çarpınız.
         farklı işaretli ise işlem yapamam mesajı veriniz.
         */

        int e = 12;
        int f = -10;
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "işlem yapamam";

        // Integer , String , Double gibi class'ların en başında kapsayıcı olarak Object class'ı var

        System.out.println(islem);
        // ternary farklı data tiplerinde sonuc return ederse sonucun data tipini "Object" yapınız
        //note: Javada her class'ın en bir tane "parent" classı vardır. sadece Object class'ın
        // "parent" class'ı yoktur.



    }

}