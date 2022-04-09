package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {
    /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("a degerini giriniz : ");
        int a= scan.nextInt();
        System.out.println("b degerini giriniz : ");
        int b= scan.nextInt();
        System.out.println("c degerini giriniz : ");
        int c=scan.nextInt();

        int delta= b*b - 4*a*c;

        if (delta>0){
            System.out.println("denklemin iki tane farkli koku vardır");
            System.out.println("x1=" + ((-b+Math.sqrt(delta))/2*a) + "\n" + "x2= " + ((-b-Math.sqrt(delta))/ 2*a) );
        }else if (delta==0){
            System.out.println("denlemin birbirine esit 2 tane koku vardir");
            System.out.println("x=" + (-b/2*a));
        }else {
            System.out.println("denklemin koku yoktur");
        }
    }
}
