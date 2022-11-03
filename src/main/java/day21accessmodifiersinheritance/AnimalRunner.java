package day21accessmodifiersinheritance;
/*
----> Inheritance sayesinde kod tekrarlarından kurtuluruz
----> Code tamiri kolay olur (maintenance)
----> child class'ları daha atomic yapmış oluruz.
----> Bir class'ı başka class'ın child class'ı yapmak için "extends" kullanılır.
----> ilk yazılan class child ,  ikinci yazılan class parent olur
----> child class object'leriparent class'tan method ve variable'ları kullana bilirler.
----> parent class object'leri child class'tan method ve variable'ları kullanamazlar.
----> Object class her parent'ıdır.
----> Java'da her class'ın parent'ı vardır. Object class hariç ama
----> Java'da parent'ı olmayan tek class Object class'ıdır.
----> private method ve variable'lar child class'lar tarafından kullanılamaz
----> protected method ve variable'lar child class'lar tarafından kullanıla bilir.
----> default method ve variable'lar aynı package'deki child class'lar tarafından da kullanıla bilir.
----> child class'lar tarafından kullanıla bilir olmak "inherit edilebilir" demektir.
----> Java Multiple inheritance kullanmaz. 1'den faza parent tanımlayamazsınız

----> 4 tip inheritance vardır
i ) Multilevel inheritance
ii ) Hierarchical inheritance---> bir parent için çoklu child
iii) Multiple inheritance ---> bir child class'a çoklu parent, Java bunu desteklemez.
iiii ) Single inheritance---> bir child class için bir parent class demektir.


 */

public class AnimalRunner { // diğer class'tan bilgi süzdü.
    public static void main(String[] args) {
        Cat c1 = new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

        Animal a1 = new Animal();
        a1.drink();
        a1.eat();


    }
}
