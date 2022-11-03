package day08stringmanipulations;


import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //example 3: ilk isim ve soyismi içeren isim ve soyismin ilk harflerini ekrana yazdır.
        System.out.println("isim ve soyismi giriniz.");
        String tamIsim = input.nextLine();
        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);//bunu daha önce gördük
        // boşluklardan parçala . üç isimde diyelim üçüncü kelime karakterini arasak [2] yazarız
        System.out.println(a+b);
        System.out.println("************");

        /*
         example 1: bir string'deki space hariç kaç tane karakter kullanıldığını gösteren
         kodu yazınız.
         */
        String str = "Ali okula gitti.";//spesifik karakteri silmek isterseniz replace kullanın
        int num = str.replace(" ","").length();
        //target- replacement === neyi yok edip, neyi yerine getireceğimizle ilgili
        // sildikten sonra içine istediğiniz karakteri yaza biliriz

        System.out.println(num);

        // bir stringdeki bütün a harflerini A-ya çeviriniz.

        String s = "Ankaranın taşına gözlerinin yaşına bak";

        String sonuc = s.replace("a","A");
        System.out.println(sonuc);

        /*
        example 3: bir string'deki tüm "kara" kelimelerinin  yerine "*" koyunuz

         */

        String t = "Kara kara düşünme Ankara";
        String yeniT = t.replace("kara","*");

        /*
        example 4 : bir stringdeki tüm sayıları "*"a çevirin

         */

        String studentId = "AC202117004";
        String yeniStudentId = studentId.replaceAll("[0-9]","*");
        System.out.println(yeniStudentId);

        //replaceAll mantık aynı. sadece küçük nüans var. [0-9] mesela. arada tire var

        /*
        bir grup datayı ifade eden kodlara Regex denir
        "Regex" regular expressions
        1) tüm rakamlar [0-9]
        2) tüm küçük harfler [a-z]
        3) tüm büyük harfler [A-Z]
        4)TÜM HARFLER [a-zA-Z]
        5) sesli harfler [aeiouAEIOU] - ingilizcedeki sesli harfler
        6) space karakteri ==> [ ]
        7) tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
        8) tüm noktalama işaretleri ==> \\p{Punct} *** bunu ezberle

         1) rakamlar hariç tüm karakterler ==> [^0-9]
         2) küçük harfler hariç tüm karakterler ==> [^a-z] - "^" hariç demek
         3) büyük harfler hariç tüm karakterler ==> [^A-Z]
         4) tüm harfler hariç tüm karakterler ==> [^a-zA-Z]
         5) Space hariç tüm karakter ==> [^ ]
         */

        /*
         example 5: verilen bir string'de kullanılan büyük harfleri noktalama işareti ve
         rakamlar ve space karakteri hariç tüm kareakterlerin sayısını bulan kodu yazın
         */

        String u = "Ali 13 yasinda, dersem inanma!...";
        int newU = u.replaceAll("[0-9]","").
                   replace(" ","").
                   replaceAll("\\p{Punct}","").
                   length(); // length karakterleri sayar
        System.out.println(newU);

        /*
        example 6: bir passwordün geçerli olup olmadığını aşağıdaki kurallara göre
        test eden kodu yazın:
        i) space hariç en az sekiz karakter olamlı
       ii) en az bir sembol içermeli
      iii) en az bir rakam içermeli
     iiii) en az bir büyük harf içermeli
    iiiii) en az bir küçük harf içermeli
         */
      String pwd = "B78C? K!m";
      boolean first = pwd.replace(" ","").length()>7;
      boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;//space de var
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean passwordGecerli = first && second && third && fourth && fifth;
        if (passwordGecerli){
            System.out.println("Password geçerlidir");
        }else {
            System.out.println("Geçersiz password");
        }

        // example 7: bir stringdeki noktalama işaretleri hariç karakter sayısını gösteren kod yazın
        String cumle = "Sen yapmazsan , ben yapmazsam, o yapmazsa kim yapacak?...";

        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number); // geriye noktalama işaretleri kaldı

        /*
         example 8 : verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa ekrana
         ""Harika" yazdırın aksi halde "Normal yazdırın
         */
        String v = "Alex";
        boolean baslangic = v.startsWith("Al");
        boolean son = v.endsWith("x");

        String result = baslangic && son ? "Harika" : "Normal";
        System.out.println(result);


    }



}
