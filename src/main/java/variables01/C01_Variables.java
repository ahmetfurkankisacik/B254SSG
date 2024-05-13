package variables01;

public class C01_Variables {
    public static void main(String[] args) {

        /*
        primitive:
        8'e ayrılır 4 tanesi tam sayi cesiti 2 tanesi ondalıkli sayi cesiti 1 tanesi karakter 1 taneside mantık icin vardi
        byte
        short
        int
        long

        float
        double

        char

        boolean

        non-primitive:
        sonsuz sayida cunku developer'ın actıgı her class bir non-primitive data turu'dur
        Wrapper Classlar
        String
        Object
        bizim olusturdugumuz her class
         */
        //data type   //variable ismi    //assignment operator    //variable yani datamizi giricez    //nokta diyebiliriz cumlenin bittigini gosterir
        char            a                  =                        'a'                                 ;
        System.out.println(a);//line
        //iki sayinin toplamini yeni bir degere atayaniz ve yazdiriniz
        byte sayi1=5;
        byte sayi2=120;
        int toplam=sayi1+sayi2;//sınır dışına cıkmasi
        //tam sayilar uzerinde islem yaptıgım zaman daima int dondurur
        System.out.println("toplam = " + toplam);


    }//main sonu
}//class sonu
