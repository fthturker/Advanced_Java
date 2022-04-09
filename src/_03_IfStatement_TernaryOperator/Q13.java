package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Lutfen uc kenarın uzunluklarını giriniz");
        System.out.println("birinci kenari giriniz : ");
        a = scan.nextInt();

        System.out.println("ikinci kenari giriniz : ");
        b = scan.nextInt();

        System.out.println("ucuncu kenari giriniz : ");
        c = scan.nextInt();

        if ((a * a) + (b * b) == c * c) {
            System.out.println("bu bir dik ucgendir");
        } else if ((b * b) + (c * c) == a * a) {
            System.out.println("bu bir dik ucgendir");
        } else if ((a * a) + (c * c) == b * b) {
            System.out.println("bu bir dik ucgendir");
        } else {
            System.out.println("bu bir dik ucgen degildir");
        }

    }
}


