package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
    1) siz class oluşturduğunuzda Java otomatik olarak görünmez bir constructor verir.
    Çünkü Java Class'ın bir kalıp olduğunu ve Object oluşturmak için yaratıldığını ve Object oluşturmak
    için constructor'ın şart olduğunu bilir.

    2) Java'nın otomatik olarak oluşturduğu bu görünmez constructor'a default constructor denir.

    3) Siz kendiniz herhangi bir constructor oluşturduğunuzda Java default constructor'ı siler

    4 ) Bir class'ta birden fazla constructor (kalıp) olabilir. Fakat bu constructor'ların parametreleri farklı
    olmalıdır.
    5) "this" keyword "Bu Class" anlamındadır. "this.price" demek bu Class'daki "price" isimli variable
    demektir. "this.price" syntax'i constructor'ların içinde kullanılır.

    6) Constructor kullanarak variable'lar üzerinde yaptığınız değişimler sadece Object üzerindeki
    variable'ların değerlerini değiştirir. Class'daki variable değerlerini değiştiremez.



    */

    public int price;
    public int year;

    public String make;
    public String model;

    public HondaAccord () {

    }

    public HondaAccord (int price) {
        this.price = price;


    }

    public HondaAccord (int price,int year) {


        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord (int price, int year , String Make , String Model) {
        this.price=price;
        this.year = year;
        this.make = make;
        this.model = model;

    }

}
