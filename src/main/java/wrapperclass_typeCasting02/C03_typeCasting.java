package wrapperclass_typeCasting02;

import java.util.Scanner;

public class C03_typeCasting {
    public static void main(String[] args) {
    //kullicindan bir karakter aliniz ve aldiginiz karakterin sayisal degerini yazdiriniz
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
       //char chr=input.next().charAt(0);//T//84
       //int sayi=chr;//autowiding
        int sayi=input.next().charAt(0);
        System.out.println(sayi);

    }
}
