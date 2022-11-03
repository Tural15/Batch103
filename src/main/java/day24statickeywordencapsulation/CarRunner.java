package day24statickeywordencapsulation;

public class CarRunner {

    /*
    Static keyword classa baglanmıs class elemanlaridir
    Static class elemanlari butun objelerin ortak elemanidir(Gokteki ay gibi)
    Staticler uzerinde yapilan her degisiklik butun obeleri etkiler, butun objeler tarafindan gorulur.
    Static class elemanlarina class uzerinden ulasilir. Objeler staticlere ulasmak icin kullanilmaz.
       kullanimda hata vermez ama tavsiye edilmez.
 */

    public static void main(String[] args) {

        Car car1= new Car();
        Car car2= new Car();
        Car car3= new Car();
        Car car4= new Car();

        System.out.println(Car.counter); // 4 ----> 4 tane obje açtığımız counter her defasında çalışacak
                                          // static çünkü

        System.out.println(car1.price); // 20001 ---> sadece car1'dekine etki eder. çalışıyoruz.

        // static olan Class'a bağlanır
        // static olmayan ise objeye bağlanır

        System.out.println(Car.counter); // 4
        System.out.println(car2.price); // 20001

        // static'lerde yaptığımız her değişiklik bütün objeler tarafından görülür.
        // gökteki Ay'ı herkesin gördüğü gibi

        // Static variable'lara Class ismi yazarak ulaşılmalıdır.


        System.out.println(Car.counter); // 4
        System.out.println(car3.price); // 20001

        System.out.println(Car.counter); // 4
        System.out.println(car4.price); // 20001

    }



}
