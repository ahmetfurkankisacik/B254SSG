package wrapperclass_typeCasting01;

public class C02_TypeCasting {
    public static void main(String[] args) {
     // bir sayinin ascii degerine gore karakterini yazdirin
        int sayi=33;

        char chr=(char) sayi;
        System.out.println(chr);//7 verdi cunku 7'nin ascii degerdeki karsiligi 55'tir

        System.out.println('7'+0);//55
    }
}
