package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban sayisini giriniz : ");
        int tabanSayisi=scan.nextInt();

        System.out.println("Lutfen us sayisini giriniz : ");
        int usSayisi= scan.nextInt();

        int sonuc=1;
        int sayac=1;
        /*
        for (int i = 0; i < usSayisi; i++) {
            sonuc=sonuc*tabanSayisi;
        }
        System.out.println(sonuc);
         */
        do {
                sonuc=sonuc*tabanSayisi;
                sayac++;
            }while (sayac<=usSayisi);
        System.out.println(sonuc);
        }
    }

