package variables02;

public class C01_Variables {
    public static void main(String[] args) {
        /*
        primitive:
        //8'e ayrılır 4 tane tam sayılar icin 2 tane ondalıklı sayilar icin 1 tane karakter degerler icin 1 tanede mantıksal degerler icin

        byte
        short
        int
        long

        float
        double

        char

        boolean


        non-primitive
        sınırsız sayidadir nedeni cunku bizim olusturdugumuz her class bir non-primitive data turudur

        String
        Wrapper Class
        Scanner
        Object
        ve olusturdugumuz olusturcagimiz tum classlar
         */

        //data type(turu) //variable ismi  //assignment operator   //deger ya da data    //nokta diyebiliriz cumlenin bittigi gosterir
        int                 sayi             =                       152                   ;
        System.out.println(sayi);//line
        //iki sayinin toplamini yeni bir degere atayaniz ve yazdiriniz
        short sayi1=7;
        byte sayi2=119;
        //iki tam sayi uzerinde islem yaparsak int deger dondurur
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);


    }//main sonu
}//class sonu
