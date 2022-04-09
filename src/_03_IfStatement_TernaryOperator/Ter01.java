package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayinizi Giriniz : ");
        int num=scan.nextInt();

       /* System.out.println("****    ternary cozomu    ****");
        String result = (num>=0) ? (num < 10  ? "Rakam" : "pozitif sayi") : ("negatif sayi");
        System.out.println(result);

        */
        System.out.println("****    if cozumu    ****");

        if (num>=0){
            if (num<10){
                System.out.println("rakam");
            }else {
                System.out.println("pozitif sayi");
            }
        }else {
            System.out.println("negatif sayi");
        }
    }
}
