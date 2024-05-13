package wrapperclass_typeCasting02;

public class C04_typeCasting {
    public static void main(String[] args) {
        //bir int deger ve bir double degeri toplayin
        //ayni sayilari toplayip sadece tam kismini alin
        double sayi1=55.7;//A
        double sayi2=67.8;
        System.out.println(sayi1 + sayi2);//autowiding sayesinde hangisi buyuk ise o sekilde dondulur double olarak dondulur
        System.out.println((int)sayi1 + (int) sayi2);//122//122
        System.out.println((int)(sayi1 + sayi2));//122//123

    }}
