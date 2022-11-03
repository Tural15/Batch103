package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i = 1 ;
        while (i<1){
            System.out.println("While Loop"); // burda hiç birşey yazdırmaz.
            i++; // while önce düşünür sonra hareket eder.
        }

        int k = 1;

        do {  // do while loop önce hareket eder sonra düşünür. mesela ATM makinalarında kullanılabilir.
            System.out.println("do while loop"); // önce bunu okudu --> do while loop
            k++;
        } while (k<1); // do while loop'da kod en az bir kere çalışır.

        // example 1 : bir ondalık sayının ondalık kısmındaki rakamları toplamını bulunuz.
        // 24,5673 --> 5+6+7+3=23
        double num = 24.5673; //bunu string'e çeviriyoz.
        String str = String.valueOf(num);
        System.out.println(str); // burda String.valueOf() methodu parantezin
                                 // içine koyulan datanın tipini string yapar.
        String decimalPart = str.split("\\.")[1];   // "." kullanmak istediğimiz zaman ---- 5673
                                    // önüne 2 adet ters slash koyalım --> "\\."
        System.out.println(decimalPart); // 5673 ama string burda
       int decimalInt = Integer.valueOf(decimalPart); // String'den bu sefer Int'e çevirdik
        System.out.println(decimalInt); // 5673 bu sefer int oldu
        int sum =0;
        do {
            sum = sum+decimalInt%10;
            decimalInt/=10;
        }while (decimalInt>0);
        System.out.println(sum);
    }
}
