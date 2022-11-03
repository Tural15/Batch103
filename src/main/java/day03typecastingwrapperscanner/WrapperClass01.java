package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*

        Primitive + Method = Wrapper Class
        Java Primitive'lere method'lar ekleyerek yeni bir yapı oluşturdu.
        bu yapıya "Wrapper Class" denir.

        Primitive     Wrapper
           byte ------ Byte
           ** int ------ Integer
           short ------ Short
           long ------ Long
           float ------ Float
           double - ----- Double
           boolean ------ Boolean
           ** char ------ Character

           wrap sarmak demek ingilizce

           Wrapper class bir class olduğu için büyük harflere çeviriyor.
         */

        byte primitiveByte = 12;


        Byte wrapperByte = 12;

        /*
        primitive byte yazıp . koyduğumuzda hiç method göremezsiniz. çünkü primitive'ler method içermez.
        wrapperByte yazıp nokta koyduğumuzda bir çok method görürsünüz. çünkü wrapper'lar method içerir.

         */
       // byte data type'nin en küçük ve en büyük değerlerini ekrana yazdırınız.


        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);// 127

        //  Example 2: short , int , long data type'larının en büyük ve en küçük değerlerini ekrana yazdırın

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//9223372036854775807

// "primitive"ler nasıl "wrapper"lara çevrilir. (Autoboxing)

        float f1 = 13.99F;
        Float wrapperF1 = f1 ; // Autoboxing

        // "wrapper"lar "primitive"lere nasıl çevrilir?

        Character w1 = 's' ;
        char primitiveW1 = w1 ; // Unboxing

        // NOTE: Autoboxing ve Unboxing Java tarafından otomatik olarak yapılır.



    }
}
