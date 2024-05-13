package wrapperclass_typeCasting01;

public class C04_typeCasting {
    public static void main(String[] args) {
        //bir int deger ve bir double degeri toplayin
        //ayni sayilari toplayip sadece tam kismini alin
        int sayi1=55;
        double sayi2=25.7;
        System.out.println(sayi1+sayi2);
        System.out.println((int)sayi1+(int)sayi2);//80
        System.out.println((int)(sayi1+sayi2));//81
    }
}
