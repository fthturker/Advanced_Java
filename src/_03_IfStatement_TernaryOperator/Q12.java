package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Vize Notunuz: ");
        int vize = scan.nextInt();

        System.out.println("Final Notunuz: ");
        int fin = scan.nextInt();

        System.out.println("Final yüzdesi kactır? ");
        double fin_yuzde = scan.nextDouble();

        System.out.println("Vize yüzdesi kactır? ");
        double vize_yuzde = scan.nextDouble();

        double not_ort = (double) (vize * vize_yuzde /100) + (double) (fin * fin_yuzde / 100);

        System.out.println("Ortalamanız hesaplanıyor............");
        System.out.println("Not ortalamanız : " + not_ort);

        if (not_ort >= 50) {
            System.out.println("TEBRİKLER dersi basarı ile gectiniz...");
        }else {
            System.out.println("Maalesef dersten kaldınız...");
        }
        System.out.println();
    }
}
