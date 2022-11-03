package day22inheritancepolymorphism;

public class Runner { // ard arda parent yaptık
    public static void main(String[] args) {
     // inheritance'da variable'lar seçilirken Java object'in data tipine bakar.
        // Öncelikle istediğiniz variable'ı object'in data type'ı olan class'ta arar.
        // O class'ın içinde bulamazsa Parent Class'lara bakar
        // Hiçbir Parent Class'ta bulamazsa hata verir.
        // Obje oluştururken data dipini Object'in data tipi child class'lardan seçilemez.


        Cat cat1 = new Cat ();
        System.out.println(cat1.a); // 14
        System.out.println(cat1.b); // 34 --- eğer class'ın içinde o variable yoksa parent'a yönelir. (Mammal)
        System.out.println(cat1.c); // 45 --- > (Animal)

        Mammal cat2 = new Cat();
        System.out.println(cat2.a); // 13

        Animal cat3 = new Cat ();
        System.out.println(cat3.a); // 12


        // Inheritance'da variable'lar seçilirken Java constructor'a bakar.
        // Öncelikle istediğiniz method'u constructor'ı kullanılan class'tan alır
        // O class'ta bulamazsa parent class'lara bakar.
        //Hiç bir yerde o methodu bulamazsa hata verir.

        Cat cat4 = new Cat();
        cat4.eat(); // cat eat
        cat4.drink(); // Mammal drink

        Mammal cat5 = new Mammal(); // new Mammal()'daki mammal constructor.
        cat5.eat(); // mammal eat

        Animal cat6 = new Animal(); // constructor'a bakıyoruz.
        cat6.eat(); // animal eat


    }
}
