package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir.";
         boolean b = a.startsWith("va",2);// ikinci karakterden sonra "va" ile başlıyor.
                                                      // mantık aynı şekilde devam ediyor.
        System.out.println(b);// true
       String c = a.replaceFirst("a","*");//J*va kolaydir. basit konu. ilk "a"yı * yaptı.
        System.out.println(c);//

        // concat() methodu 2 tane stringi birbirine yapıştırmaya yarar
        String d = a.concat(" Anladın mı?");
        System.out.println(d); // Java kolaydir. Anladın mı?

        // "Concatination" işlemi 2 türlü yapılabilir.
        //i) + ile ii) concat() ile
        // Java bir işlem için method üretmişse o methodu kullanmak en iyi yoldur.
        // concat () methodu her zaman en sona ekler.

        // trim - birşeyi ucundan kesmek
        String e = "    Tom Hanks    ";// baştaki ve sondaki space'leri siler. aradaki space karakterlerine dokunmaz
        System.out.println(e); //     Tom Hanks
        String f = e.trim();
        System.out.println(f); // Tom Hanks

        String h = "Java";
        String i = "Kava";
        int k = h.compareTo(i);
        System.out.println(k); // -1
        // ÇÜNKÜ ALFABETİK SIRALAMADA K , J'DEN SONRA GELDİĞİ İÇİN ARADAKİ FARK -1O   OLUR
        // BÜYÜK HARF KÜÇÜK HARF FARKI OLMADAN YAPARSAK IGNORECASE TÜRÜ DE VAR
        // compare methodu 2 tane stringi alfabetik olarak karşılaştırır.
        // bu kodda "h"nin alfabetik sırasında "i"nin alfabetik sırası çıkartılır.

        String n = a.repeat(0);  // "Java kolaydır"ı yanyana 3 kere tekrarlattı
        System.out.println(n); // Java kolaydir.Java kolaydir.Java kolaydir.
      // repeat (0) empty string return eder.

        // JAVA document'e ulaşmak için ctrl'e basılı tutun methodlara ulaşmak için




    }
}
