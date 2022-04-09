package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan = new Scanner(System.in); //kullanicidan ınput almak icin Scanner obje create ettik
		System.out.println("Toplama icin 1\ncıkarma icin 2\nbolme icin 3\ncarpma icin 4"); //kullanıya secim icin islem menusu yazdırdık
		System.out.println("İslem turunu seciniz");
		int islem=scan.nextInt(); //kullanıcının  islem tercihi icin variable create edildi
		System.out.println("lutfen iki tam sayi giriniz"); //kullanıcıya bildirimde bulunuldu
		double num1=scan.nextInt(); // 1. sayi asign edildi
		double num2=scan.nextInt(); // 2. sayi asign edildi

		if (islem==1){
			System.out.println("Toplama isleminin sonucu :" +num1+" + "+num2+" = "+(num1+num2));
		}else if (islem==2){
			System.out.println("Cıkarma isleminin sonucu :" +num1+" - "+num2+" = "+(num1-num2));
		}else if (islem==3){
			System.out.println("Bolme isleminin sonucu :" +num1+" / "+num2+" = "+(num1/num2));
		}else if (islem==4){
			System.out.println("Carpma isleminin sonucu :" +num1+" * "+num2+" = "+(num1*num2));
		}else {
			System.out.println("Hatalı secim yaptınız tekrar deneyiniz");
		}
	}
}
