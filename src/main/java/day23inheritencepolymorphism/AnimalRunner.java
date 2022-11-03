package day23inheritencepolymorphism;

public class AnimalRunner {

    public static final int age = 12;

    public static void main(String[] args) {

        Cat cat = new Cat () ;

        cat.eat(); // animals eat ----> bu çıktıyı update etmek istersek
                   // generate yaparak işleme devam ederek override yapıyoruz
                   // değişiklik yaptığımız için Cats eat çıktısı aldık.

      //  age++; bunu yazarsak Java şikayet eder.
    }
}
