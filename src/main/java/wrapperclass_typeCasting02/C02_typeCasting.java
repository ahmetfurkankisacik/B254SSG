package wrapperclass_typeCasting02;

public class C02_typeCasting {
    public static void main(String[] args) {
        // bir sayinin ascii degerine gore karakterini yazdirin
        int sayi=65;//A
        //System.out.println(Integer.MAX_VALUE);
        System.out.println('A'+0);//55 verdi cunku 7'nin ascii tablodaki sayisal degeri 55'tir
        char chr=(char)sayi;
        System.out.println(chr);
        /*
        char bir deger sayisal degerle toplanırsa ascii degerini verir stringle toplanırsa karakter olarak verir
         */

    }
}
