package day20stringbuilderstringbuffer;

public class StringBuffer01 {
    /*
    1) StringBuffer Java'da bir class'dır ve String oluşturmaya yarar.
    2) StringBuffer Class, StringBuilder gibi "mutable"dır.

    StringBuffer ve StringBuilder arasındaki fark nedir?
    1) StringBuffer threadsafe'dir.---->
       MultiThread=Coklu Is ---> Java aynı anda çok iş yapar.

     StringBuffer çoklu iş yapar
     StringBuilder çoklu iş yapmaz.

     2) StringBuffer synchronized-dir.  İşleri sıralama becerisi vardır.

     Senaryolar:
     1) Değiştirilemez data için "String Class" kullanılır
     2) Değiştirilebilir ama "multi-thread" gerekmeyen durumlar için ""StringBuilder" kullanılır
     3) Değiştirilebilir ve "multi-thread" gereken durumlar için "StringBuffer" kullanılır.

     -----> yukardakileri duruma göre kullanırız.

               */

}