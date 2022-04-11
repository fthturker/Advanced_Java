package P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi=new ArrayList<>();
    static List<Kisi>ogrtmListesi=new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim=scan.next().toUpperCase();
        switch(secim){
            case "1":
                kisiTuru="OGRENCI";
                islemeMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemeMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatali giris yaptiniz   :(");
                girisPaneli();// recursive method call (tekrar panele donecek)
                break;


        }






    }

    private static void cikis() {
        System.out.println("tekrar bekleriz gule gule");
    }

    public static void islemeMenusu(){
        System.out.println("Sectiginiz  Kişi turu: "+ kisiTuru+" icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem=scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                islemeMenusu();
                break;
            case 2:
                islemeMenusu();
                break;
            case 3:
                islemeMenusu();
                break;
            case 4:
                islemeMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("hatali giris yaptiniz -( ");
                islemeMenusu();
                break;
        }


    }

    private static void ekle() {
        System.out.println("    ****    "+kisiTuru+ " ekleme sayfasi    ****");
        System.out.print("ad soyad giriniz : " );
        scan.nextLine(); // dummy hayalet komut
        String adSoyad=scan.nextLine();
        System.out.print("kimlikNo giriniz : " );
        String kimlikNo=scan.nextLine();
        System.out.print("yas giriniz : " );
        int yas=scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){
            System.out.print("ogrenci No giriniz : " );
            scan.nextLine();
            String ogrenciNo=scan.nextLine();
            System.out.print("sinif giriniz : " );
            String sinif=scan.nextLine();
            Ogrenci sefilOgrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif); // p'li cons ogrnc obj create edildi
            ogrncListesi.add(sefilOgrenci);

        }else{
            System.out.print("sicil No giriniz : " );
            scan.nextLine();
            String sicilNo=scan.nextLine();
            System.out.print("bolum giriniz : " );
            String bolum=scan.nextLine();
            Ogretmen muhtesemOgretmen=new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);// p'li cons ogrnc obj create edildi
            ogrtmListesi.add(muhtesemOgretmen);
        }
    }


}
