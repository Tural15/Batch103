package day23inheritencepolymorphism;

public class Cat extends Mammal{

    public void meow () {
        System.out.println("Cats meow");
    }

    @Override
    public int add(int a, int b) { // short yapamayazı açıklama 9)'a bak
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) { // açıklama 10)'a bak
        return a*b+1;
    }

    @Override
    public Mammal create() {
        return new Mammal();
    }

    @Override // Override annotation kullanarak Java'nın yaptığımız Override işlemini kontrol etmesini sağlarız.
    public void eat() {
//        super.eat(); // parent'deki uygulamayı kullanmak istemiyorum onun için super.eat()'i sileriz
        System.out.println("Cats eat"); // parent'deki çıktıyı değiştirdik. Override

                                        // yandaki O tuşu class'lar arası gezintiye çıkarır.





        /*
        1) Override yaparken method'un body'si değiştirilir.
        2) Override yaparken ASLA method signature'ye (method isim ve parametleri)dokunulmaz
        3) Override yaparken "inheritance" olmak zorundadır. parent olması gerek
        4) Override yaparken Access modifier'lar belli kurallara göre farklılaştırıla bilirler.
        5) private methıd'lar Override edilemezler.
        6) child class'daki Override edilen method'un access modifier'ı parent class'daki
           method'un access modifier ile aynı veya geniş olmalıdır.( önemli burası)
           yani parent child class'ı sınırlaya bilir.
           Note: child class'daki access modifier'ı daha dar olamaz.

        7) Default method'lar aynı package içindeyse Override edilebilirler.
           Farklı package'den Override edilemezler.

      8) Parent Class 'daki method'un return type'ı void'se "return type" değiştirilemez

      9) Parent Class'daki method'un "return type"'ı primitive ise "return type" değiştirilemez.


     10) Parent Class'daki method'un "return type"'ı Wrapper Class ise "return type" değiştirilemez.

     11) Parent Class'daki method'un "return type"'ı Parent Class ise "return type" child'lardan biri olabilir.
         Not: Child Class'daki return type Parent Class'dakinden geniş olamaz.
         Not: Aralarında parent child ilişkisi olmayan class'lar Override'da return type değişiminde
              kullanılamazlar.
              Mesela: "Short" "Integer"'dan küçüktür. ama aralarında parent child ilişkisi olamdığından
                       Integer yerine Short kulanamazsınız.

     Note: Child'daki method'un return type'ından parent'daki method'un return type'ına gidişte
           IS-A relationship olamalıdır. (COVARIANT)

      Note: Parent'dan child'a gitmek istersen HAS-A relationship ilişkisi olmalıdır.


     12) 10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
    "final" method body degistirilmesine musaade etmez.

      13) Polymorphism = Overloading + Overriding
          Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatın
          Note: Overloading ve Overriding arasındaki farklar?
          1) Overloading için inheritance gerekmez. fakat Overriding için gerekir.
          2) Private method'lar Overload edilebilir.(aynı class'ın içinde çünkü) ama Override edilemezler.
      .   3) "final" method'lar Overload edilebilir. Override edilemezler.
          4) "Overloading" static polymorphism olarak, Overriding dynamic polymorphysm olarak adlandırılır.
             Çünkü "static" method'lar Overload edilebilir, Override edilemezler.
          5) "Overloading"'de method signature değişir ama Overriding'de method signature'a dokunulmaz.

         */

    }
}
