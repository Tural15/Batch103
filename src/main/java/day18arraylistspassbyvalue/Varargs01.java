package day18arraylistspassbyvalue;

public class Varargs01 {
    // iki sayının toplamını return eden method oluşturun
/*
1) Farklı sayılardaki parametrelerle çalışabilen bir method oluşturmak isterseniz "varargs" kullanmalıyız
2) "Varargs" arka tarafta array kullanır. Bu yüzden varargs'la çalışırken arraylerle çalışıyor gibi
davrana biliriz.
3) Varargs oluşturmak için "<data type> ...  < varargs ismi >" veya "<data type>  ...< varargs ismi >"
4) Bir method'da varargs'ın yanında başka bir parametre kullanıla bilir mi?
   Varargs en sonda olmak şartıyla kulanıla bilir
5) Bir method'da birden fazla "varargs" kullanıla bilir mi?
   varargs en sonda olmak zorunda olduğundan birden fazla kullanıldığı için en az biri en sonda olmayacak.
   bu da 4. kural ile çelişir.
 */

    public static void main(String[] args) {
        add(5,10);
        System.out.println(add(5,10));

        System.out.println(add(5,10,30,40));


    }
    public static int add (int a , int b) { return a+b ;}

    public static int add ( int...a ){ // int... a ---> dipsiz kuyu gibi ---- > varargs yani dilediğimiz
                                        // sayı yaza biliriz.
                                        // Varargs'ın arka planında arrayler çalışır.
        int sum = 0;
        for ( int w : a) { sum = sum + w; }
        return sum;

    }

}

// istediğimiz kadar sayıyı toplaya bileceğimiz method oluşturalım