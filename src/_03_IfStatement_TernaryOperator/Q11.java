package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */
        Scanner scan = new Scanner(System.in);

        int gun;
        int ay;
        int yil;

        System.out.println("Tarihi gun,ay,yil olarak istenen sekliyle giriniz...");

        System.out.println("Lutfen gunu giriniz");
        gun = scan.nextInt();

        if (gun > 0 && gun <= 31) {

        }else {
            System.out.println("Yanlis giris yaptiniz. Program sonlaniyor");
            return;
        }

        System.out.println("Lutfen ay giriniz");
        ay = scan.nextInt();

        if (ay > 0 && ay <= 12) {

        }else {
            System.out.println("Yanlis giris yaptiniz. Program sonlaniyor");
            return;
        }

        System.out.println("Lutfen yili giriniz");
        yil = scan.nextInt();

        if (yil > 0 ) {

        }else {
            System.out.println("Yanlis giris yaptiniz. Program sonlaniyor");
            return;
        }

        System.out.println("Ay/Gun/Yil : " + ay + "/" + gun + "/" + yil);
        System.out.println("Yil/Ay/Gun : " + yil + "/" + ay + "/" + gun);
        System.out.println("Gun/Ay/Yil : " + gun + "/" + ay + "/" + yil);
    }
}
