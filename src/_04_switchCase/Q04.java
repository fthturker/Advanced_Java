package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // kullanıcının yasadığı güne göre
        // 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta baslangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("pazartesi: 1\nSalı: 2\nCarsamba: 3\nPersembe: 4\nCuma: 5\nCumartesi: 6\nPazar: 7 \nHaftanın kacıncı gunu oldugunu giriniz");

        int kacıncıGun = scan.nextInt();

        if (kacıncıGun <= 0 || kacıncıGun > 7){
            System.out.println("Hatalı veri girdiniz");
        }else
            System.out.println("kac gun sonrasını ogrenmek ıstıyorsunuz");


        int kacGunSonrası = scan.nextInt();
        int bulunanGun = (kacGunSonrası  + kacıncıGun) % 7;



        switch (bulunanGun){
            case 1:
                System.out.println( kacGunSonrası + " gun sonra gunlerden PAZARTESİ");
                break;
            case 2:
                System.out.println( kacGunSonrası + " gun sonra gunlerden SALI");
                break;
            case 3:
                System.out.println( kacGunSonrası + " gun sonra gunlerden CARSAMBA");
                break;
            case 4:
                System.out.println( kacGunSonrası + " gun sonra gunlerden PERSEMBE");
                break;
            case 5:
                System.out.println( kacGunSonrası + " gun sonra gunlerden CUMA");
                break;
            case 6:
                System.out.println( kacGunSonrası + " gun sonra gunlerden CUMARTESİ");
                break;
            case 0:
                System.out.println( kacGunSonrası + " gun sonra gunlerden PAZAR");
                break;
            default:
                System.out.println("agam hafta 7 gun : ");




        }




    }
}

