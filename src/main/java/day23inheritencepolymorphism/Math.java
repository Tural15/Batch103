package day23inheritencepolymorphism;

public class Math extends Courses {

    public void practice () {
        System.out.println("solve questions");
    }

    public Math () {
        super ("Second"); // bu da özel string parametresi kullandığı için Courses class'ındaki
        // public Courses (String s) 'e yönlendirecek.
        System.out.println("Constructor 1");
    }

    public Math (int a) {
         this (); // this her zaman parametresiz constructor'a yönlendirir. ---> burda public Math ()
        System.out.println("Constructor 2");
    }

}
