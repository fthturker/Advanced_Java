package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
  çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
   */
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("    ****    ");
      System.out.println("  ATM'ye hos geldiniz :-)   ");
      System.out.println("bakiye sorguluma : 1\nPara Cekme : 2\nPara Yatırma : 3\nCıkış : 4\nyapacagınız islem");

      int islem=scan.nextInt();
      int bakiye=1000;

      switch (islem){
        case 1:
          System.out.println("mevcut bakiyeniz : "+bakiye);
          break;
        case 2:
          System.out.println("cekeceginiz miktarı giriniz : ");
          int cekilenMiktar= scan.nextInt();
          if (cekilenMiktar>bakiye){
            System.out.println("agam niddin olmayan parayı mı cekeceksin");
          }else {
            bakiye=cekilenMiktar;
            System.out.println("bakiyenizin guncel hali : "+bakiye);
          }
          break;
        case 3:
          System.out.println("yatıracagınız miktarı giriniz : ");
          int yatırılanmiktar=scan.nextInt();
          bakiye+=yatırılanmiktar;
          System.out.println("bakiyenizin guncel hali : "+bakiye);
          break;
        case 4:
          System.out.println("cıkısınız yapılmıstır yine bekleriz");
          break;

      }

    }
}

