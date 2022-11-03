package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
    1) Java variable'ların orijinal değerlerini korumak ister.
    2) Variable methodlar içinde kullanıldığında Java method'un içine orijinal değeri koymaz, o değerin
    kopyasını üretir ve method'a o kopyayı yollar. Method kopya üstünde çalışır ve değişiklik yapar.
    Dolayısıyla, variable'ın orijinal değeri korunmuş olur.
    Bu sisteme "Pass By Value" denir.
    Note: Java "Pass By Value" kullanır
    Note: Bazı programlama dilleri orijinal değeri koruma altına almamıştır. Bu işi
          developer'lara bırakmıştır. Bu tarz diller "Pass By Reference" kullanır.


     */


    public static void main(String[] args) {
        int x = 5;
        System.out.println(x); // 5

        // static method olan main method'un içindeki herşey static olmalıdır

        change (x); // 15
        System.out.println(x); // 5

        int ucret = 100;
        indirim(ucret);
        System.out.println(ucret); // 100
        indirim(100);
        System.out.println(indirim(100));
    }

    public static void change (int a) { System.out.println(a*3); } // method oluşturduk
    // void dışındaki return type'larda method body'si içinde return keyword kullanılmalıdır.

    public static int indirim (int gomlekUcreti) { return gomlekUcreti - 10; }

}
