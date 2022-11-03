package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {
    //example 1: 3den 6ya kadar tam sayıların toplamını bulan kodu yazın

        int sum = 0;
        for (int i = 3; i<7  ;       i++ ) {
            sum = sum + i;
            System.out.println(sum); // 3 7 12 18
        } //sadece son değerini görmek istiyorsak

        System.out.println(sum);// 18

        // eğer sout loop'un dışına yazılırsa sum'ın sadece son değerini ekrana yazdırır
        // eğer sout loop'ın içine yazılırsa sum'ın hangi değerler aldığını yazdırır.

        // example 2: 6dan 3e kadar tamsayıların çarpımını bulan kodu yazınız
        int multiply = 1 ;
        for (int i = 6 ; i>2 ; i--){
            multiply = multiply*i;
        }
        System.out.println(multiply);

        // example 3 : size verilen bir tamsayının rakamları toplamını bulunuz.
        int num = 385;
        Math.abs(num); // eğer olur da eksi sayı girersek.
        int sonuc = 0;
        for ( int i = 385  ; i>0 ; i=i/10 ){
            sonuc = sonuc+i%10;
        }
        System.out.println(sonuc); // i>0 iken loop'un içine giriyor. sonra üçüncü parametreye giriyor.****

        // example 4: size verilen bir string'i ters çeviren kodu yazınız.
        // kaba ==> abak

        // Concatination yapacaksak "" kullanalım
        String str = "Kaba";
        String ters = "";
       for (int i = str.length()-1 ; i>=0  ; i-- ) {
           char c = str.charAt(i);
           ters = ters + c;
       }
        System.out.println(ters);

    }
}
