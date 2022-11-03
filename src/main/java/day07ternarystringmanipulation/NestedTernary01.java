package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        verilen yılın "leap year" olup olmadığını kontrol eden kodu yazınız.
        i) yıl 100e bölünürse 400e de bölünmelidir. 1600
        ii) yıl 100e bölünmezse 4e bölünmelidir. 1996     // mesela 2001 leap year değil
         */
    int year = 1996;

    String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year değil") : (year%4==0 ? "Leap year" : "Leap year değil");

        System.out.println(leap);
        /*
        aşağıdaki kurallara göre password'ün geçerli olup olmadığını kontrol eden kodu yazınız
        i) sekiz karakterden fazla veya  sekiz karakter varsa ilk harfi 'i' olmalıdır
        ii) sekiz karakterden az karakter varsa ilk harfi 'K' olmalıdır.

         */


        String pwd = "i2a3ed54";
        char ilkHarf = pwd.charAt(0);

       String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "Geçerli" : "Geçersiz") : (ilkHarf=='i' ? "Geçerli" : "Geçersiz");
        System.out.println(gecerli);


    }
}
