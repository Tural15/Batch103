package day21accessmodifiersinheritance;

public class StudentRunner {
    public static void main(String[] args) {
       Student std1 = new Student(); // objenin yardımıyla daha önceki Student class'ına ulaştık
                                     // sadece o class'taki private bilgiye ulaşamadık
                                     // birşey private ise sadece içinde bulunulan class'tan ulaşa biliriz.
        System.out.println(std1.email); // th@gmail.com
        System.out.println(std1.stdName); // Tom Hanks
        System.out.println(std1.address); // Miami



    }
}
