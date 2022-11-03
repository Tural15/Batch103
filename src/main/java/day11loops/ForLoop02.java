package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        // example 1 : Bir stringdeki hariç tüm karakterleri yazdırınız.
        // andromeda

        String str = "AndromedaM";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.print(c);
            }
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue; // BOŞVEEEER. pas geç yani. Loop'un içinde bazı değerler için Loop'un çalışmamasını
                          // isterseniz "continue" kullanınız
            }
            System.out.print(c);
        }
        System.out.println();
        // example 2: 1den 100e kadar tüm tam sayıları ekrana yazdırınız. 6 ile bölünenler hariç
        for (int i = 1  ; i<101  ; i++ ){
            if (i%6==0){continue;}

            System.out.print(i + " ");
        }
        System.out.println();
        // example 3: size verilen bir string'deki 'm'den önceki karakterleri yazdırınız
        // Luxemburg
        String s = "Luxemburg";
        for (int i =0  ; i<s.length()  ; i++ ){
           char c = s.charAt(i);
           if (c=='m'){break;} // break - loop'u kırdı burada
            System.out.print(c);
        }

    }
}