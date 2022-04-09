package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz");
        double boy= scan.nextDouble();

        System.out.println("Kilonuzu giriniz");
        double kilo= scan.nextDouble();

        double bmi=kilo/(boy*boy);

        if (bmi<=20){
            System.out.println("Oldukca zayıfsınız");
        }else if (20<bmi & bmi<=25){
            System.out.println("Normal sınırlardasınız");
        }else if (25<bmi & bmi<=30){
            System.out.println("Sisman kategorısındesiniz");
        }else if (30<bmi){
            System.out.println("Obez grubundasiniz");
        }
    }
}
