package day09stringmanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Kara kara dusunme Ankara";
        int idxA = str.indexOf("kara");//string'deki bütün a'ların indeksini bulur.
        // burda ilk baştaki a'nın indeksini verir//5
        System.out.println(idxA);

        //lastIndex() method'da mesela a'nın son görünüm indeksini verir
        int lastidxA = str.lastIndexOf("kara");
        System.out.println(lastidxA);//20

        String s = "Mississippi";
        int idxI = s.indexOf('i'); // indexOf()'un içinde hem char hem de string yaza biliriz.
        System.out.println(idxI); // char'da tek tırnakla yazacağız. ==> ''

        int idxIss1 = s.indexOf("iss");// ilk görünümün ilk karakterinin indeksini verir.
        int idxIss2=s.lastIndexOf("iss");//son görünümün ilk karakterini verir
        System.out.println(idxIss1);//1
        System.out.println(idxIss2);//4

        //example 1:
        /*
        bir stringdeki bir karakterin tekrarlı veya tekrarsız olup olmadığını gösteren
        kodu yazın
         */
        String t = "Helloooo";
        //indexOf () == lastIndexOf() ----> tekrarsız
        //indexOf () != lastIndexOf() ----> tekrarlı

        if(t.indexOf('H')==t.lastIndexOf('H')){
            System.out.println("Tekrarsız");
        }else {
            System.out.println("Tekrarlı");
        }


        String u = "Learn Java earn money";
        int sonuc = u.indexOf("a",6);// ilk 6 karakterden sonraki a'nın görünümü
        System.out.println(sonuc);
        int sonuc1 = u.indexOf("n",5);//14-->ilk 5 karakterden sonraki n'nin görünümü
        // yani ilk 5 karakteri dikkate almayız.
        System.out.println(sonuc1);
        int sonuc2 = u.indexOf("e",4);//11--> ilk 4 karakteri görmedi.
        //indexOf () iki parametre ile kullanılırsa ikinci parametrede verilen sayı kadar
        //characteri geçtikten sonra istenen charavter'in ilk görünümünün indeksini return eder

        System.out.println(sonuc2);


        // lastIndexOf ( ) 2 parametreyle kullanılırsa ikinci parametrede verilen sayıyı indeks olarak
        //kabul edip en baştan bu indekse kadar olan karakterleri bir kutu içine alınız
        // ve lasIndexOf () methodunu sadece bu kutu içindeki String için kullanınız
        String m = "Hello Everyone";
        int e = m.lastIndexOf("e", 7);// 5. indekse kadar bütün karakterleri alacak
        System.out.println(e);                     // ve o indekse kadar olan aralıktaki son e harfini alacak
                                                   // ve e harfinin indeksini alacak

        String v = "Java is Java";
        boolean bosMu = v.isEmpty();
        //isEmpty () methodu ,verilen bir string'in boş olup olmadığını söyler
        //eğer string'de hiç karakter yoksa isEmpty () methodu true return eder.
        //aksi halde false return eder.
        // length() == 0 demek , isEmpty true verir anlamına gelir.
        //isEmpty daha güzel duru kullanırken.
        //bir stringin boş olup olmadığını anlamak için isEmpty() kullanın
        // length()==0 kullanmak şık olmaz
        System.out.println(bosMu);//false--> boş string değil çünkü

        String x = "    ";

        boolean blankMi = x.isBlank();
        System.out.println(blankMi);
        //isBlank () hem boş string için hem de sadece space içeren stringler için true return eder.


        //example 2: kullanıcıdan alınan isim mutlaka space'den farklı en az 1 karakter içermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        String ilk = input.nextLine();
        if (ilk.isBlank()){
            System.out.println("sana ismini gir dedim");
        } else {
            System.out.println(ilk);
        }
    }
}
