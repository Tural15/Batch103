package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names); // [Tom, Thomas, Tahsin, Trump, Taceddin]


        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");
        names.removeAll(cities); //
        System.out.println(names); // [Thomas, Tahsin]
        System.out.println(cities); // [Trump, Tom, Taceddin]

        // removeAll () kullandığınızda sadece ilk list değişir. parantezin içindeki list değişmez

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");


        boolean sonuc1 = names.containsAll(myNames); // eğer Thomas ve Tahsin de ikisi birden varsa
        System.out.println(sonuc1); // True verir

        // bir listin içinde çoklu elemanların var olup olmadığını kontrol eder.


        // example 1: a list'inde shoes elemanının ilk görünümünü siliniz
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a); // [Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        a.remove("Shoes");
        System.out.println(a); // [TV, Radio, Laptop, Shoes, Book, Shoes]

        // example 2 : Shoes elemanının tüm görünümlerini siliniz

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes"); // yeni br list oluşturduk burada
        a.removeAll(silinecekler);
        System.out.println(a); // [TV, Radio, Laptop, Book]

        // example 3 : bir tane salary list'i oluşturun.
        //             eğer salary 10000'den az ise %20 , 10000'den çok ise % 10 zam yapınız

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8679.00);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary); // [13579.500000000002, 10414.8, 16500.825, 11400.0, 22550.000000000004]


        //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
//Note: Iki ArrayList'in esit olabilmesi icin,elemanlar esit olmali ve ayni elemanlar ayni index'te olmali
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');
//m.add('t');
        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

//1.Way:
        int counter = 0;//Flag

        for (int i = 0; i < m.size(); i++) {
            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if (counter == 0) { System.out.println("Listler esittir"); }

        //2.Way:

        boolean esitMi = m.equals(n);
        if (esitMi) { System.out.println("Listler eşittir"); }
        else System.out.println("Eşit değildir.");

    }

}