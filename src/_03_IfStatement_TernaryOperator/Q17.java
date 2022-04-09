package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TASK:
		// Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz : ");
		int year = scan.nextInt();

		/* System.out.println("*****     if cozumu     *****");
		
		if (year % 100 ==0 && year % 400 ==0){
			System.out.println("Girdiginiz " + year + " yili ARTIK YIL");
		}else if(year % 100 !=0 && year % 4 ==0){
			System.out.println("Girdiginiz " + year + " yili ARTIK YIL");
		}else {
			System.out.println("Girdiginiz " + year + " yili ARTIK YIL degildir");
		}
		*/
		//ternary cozumu

		System.out.println("*****     ternary cozumu     *****");

		String result = year % 100 ==0 ? year % 400 ==0 ? "Artik Yil" : "Artik Yil degildir" :
						year % 4 ==0 ? "Artik Yil" : "Artik yil degildir";
		System.out.println(result);
	}
}
