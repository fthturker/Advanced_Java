package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        // kullaniciden bir harf girmesini istedik
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf giriniz : ");
        String kelime = scan.nextLine();

        // sesli ve sessiz harfleri tanimlayalim
        String sesliHarf = "aeuoi";
        String sessizHarf = "qwrtyplkjhgfdszxcvbnm";

        // kosullarımızı yazıyoruz
        if (kelime.length() == 1) {
            for (int i = 0; i < sessizHarf.length(); i++) {
                if (sesliHarf.contains(kelime)) {
                    System.out.println("sesli");
                    break;
                } else if (sessizHarf.contains(kelime)) {
                    System.out.println("sessiz");
                    break;
                } else {
                    System.out.println("Yanlis karakter girdiniz!!!");
                    System.out.println("Lutfen harf giriniz...");
                    break;
                }
            }
        } else {
            System.out.println("Yanlis karakter girdiniz!!!");
            System.out.println("Lutfen harf giriniz...");
        }
    }

}


