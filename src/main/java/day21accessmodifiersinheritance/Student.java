package day21accessmodifiersinheritance;

public class Student {
    /*
        Access Modifier
        1)public     2)protected     3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)     4)private

        Note: Access Modifier'lari genisden dara dogru sayiniz
              public > protected > default > private
        Note: Access Modifier'lari birer birer aciklayiniz
              public olanlar her class'dan kullanilabilir
              protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
              private olanlar sadece olsturulduklari Class icinde kullanilabilirler
        Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar
        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz
     */



    // public her class'tan kullanıla bilir. ve hatta package'dan da kullanılabilir.
    public String stdName = "Tom Hanks"; // öğrenci ismi public'dir.


    // protected olanlar başka package'lardan kullanılmaz.
    // ancak başka package'de child class içinden kullanıla bilir.
    protected String address = "Miami";


    // default olanlar başka package'den kullanılamazlar. diğer adı da package private
    String email = "th@gmail.com"; // default burada



    // private olanlar sadece oluşturuldukları class içinde kullanıla bilirler.
    private String stdId = "20206517004";




}
