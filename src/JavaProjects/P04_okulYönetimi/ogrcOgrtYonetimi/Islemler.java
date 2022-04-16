package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi = new ArrayList<>();
    static List<Kisi> ogrtmListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemeMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
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

    public static void islemeMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                islemeMenusu();
                break;
            case 2:
                arama();
                islemeMenusu();
                break;
            case 3:
                listele();
                islemeMenusu();
                break;
            case 4:
                sil();
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

    private static void sil() {
        System.out.println("    ****    " + kisiTuru + " sil sayfasi    ****");

    }

    private static void listele() {
        System.out.println("    ****    " + kisiTuru + " listeleme sayfasi    ****");
        if (kisiTuru.equalsIgnoreCase("OGRENCİ")){ // ogrenci listeliyorsa
            System.out.println(ogrncListesi);

        }else{// ogretmen listeliyorsa
            for (Kisi k:ogrtmListesi){
                System.out.println(k.toString());

            }

        }
    }

    private static void arama() {
        System.out.println("    ****    " + kisiTuru + " arama sayfasi    ****");

        boolean flag = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { // ogrenci arıyorsa if
            scan.next(); //dummy
            System.out.print("aradiginiz ogrenci kimlik no giriniz :");
            String arananKimlikNo = scan.next();
            for (Kisi k : ogrncListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) { // flag havada
                    System.out.println("aradiginiz ogrenci :" + k.getAdSoyad());
                    flag = false;
                }

            }
            if (flag) { // flag inince
                System.out.println("aradıgınız ogrenci mevcut degil");
            }
        } else { // ogretmen ariyorsa
            System.out.print("aradiginiz ogretmen kimlik no giriniz :");
            scan.next(); //dummy
            String arananKimlikNo = scan.next();


            for (Kisi k : ogrtmListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) { // flag havada
                    System.out.println("aradiginiz ogretmen :" + k.getAdSoyad());
                    flag = false;
                }

            }
            if (flag) { // flag inince
                System.out.println("aradıgınız ogretmen mevcut degil");
            }
        }
    }

    private static void ekle() {
        System.out.println("    ****    " + kisiTuru + " ekleme sayfasi    ****");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine(); // dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("kimlikNo giriniz : ");
        String kimlikNo = scan.nextLine();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCI")) {
            System.out.print("ogrenci No giriniz : ");
            scan.nextLine();
            String ogrenciNo = scan.next();
            System.out.print("sinif giriniz : ");
            String sinif = scan.nextLine();
            Ogrenci sefilOgrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif); // p'li cons ogrnc obj create edildi
            ogrncListesi.add(sefilOgrenci);

        } else {
            System.out.print("sicil No giriniz : ");
            scan.nextLine();
            String sicilNo = scan.next();
            System.out.print("bolum giriniz : ");
            String bolum = scan.next();
            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);// p'li cons ogrnc obj create edildi
            ogrtmListesi.add(muhtesemOgretmen);
        }
    }


}
