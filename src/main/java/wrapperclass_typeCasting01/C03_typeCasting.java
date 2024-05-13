package wrapperclass_typeCasting01;

import java.util.Scanner;

public class C03_typeCasting {
    public static void main(String[] args) {
     //kullicindan bir karakter aliniz ve aldiginiz karakterin sayisal degerini yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        int sayi=input.next().charAt(0);//kucuk data buyuk datanin icine girer
        System.out.println(sayi);

    }
}
