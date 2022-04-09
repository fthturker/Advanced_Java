package _10_List;

import java.util.Scanner;

public class QTasKagitMakas02 {
    static int kulPuan;
    static int pcPuan;
    static int secim;
    static int pcSecim;

    public static void main(String[] args) {
         /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println(">===Tas Kagit Makas Oyununa Hosgeldiniz==<");
        System.out.println("Tas icin 1 /Kagit icin 2/Makas icin 3 giriniz");

        while (true) {
            secim = scan.nextInt();
            pcSecim = (int) (Math.random() * 3);
            if (secim == 0) {
                System.out.println("Tesekkur ederiz yine bekleriz");
                break;
            }
            if (secim == 1) {
                if (pcSecim == 1) {
                    System.out.println("Pc nin Secimi:Tas  Sonuc:Berabere");
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                } else if (pcSecim == 2) {
                    System.out.println("Pc nin Secimi:Kagit  Sonuc:Kaybettiniz");
                    pcPuan++;
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                } else {
                    System.out.println("Pc nin Secimi:Makas  Sonuc:Kazandiniz");
                    kulPuan++;
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                }
            } else if (secim == 2) {
                if (pcSecim == 1) {
                    System.out.println("Pc nin Secimi:Tas  Sonuc:kazandiniz");
                    kulPuan++;
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                } else if (pcSecim == 2) {
                    System.out.println("Pc nin Secimi:Kagit  Sonuc:Berabere");
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                } else {
                    System.out.println("Pc nin Secimi:Makas  Sonuc:Kaybettiniz");
                    pcPuan++;
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                }
            } else if (secim == 3) {
                if (pcSecim == 1) {
                    System.out.println("Pc nin Secimi:Tas  Sonuc:kaybettiniz");
                    pcPuan++;
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                } else if (pcSecim == 2) {
                    System.out.println("Pc nin Secimi:Kagit  Sonuc:Kazandiniz");
                    kulPuan++;
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                } else {
                    System.out.println("Pc nin Secimi:Makas  Sonuc:Berabere");
                    System.out.println("Puaniniz: " + kulPuan + " Pc nin Puani: " + pcPuan + " Oyunu Bitirmek Istiyorsaniz 0 giriniz");
                }
            } else {
                System.out.println("Hatali giris");
                System.out.println("Tas icin 1 /Kagit icin 2/Makas icin 3 giriniz");
            }
            if (kulPuan == 3) {
                System.out.println("Oyunu " + kulPuan + "-" + pcPuan + " kazandiniz");
                break;
            } else if (pcPuan == 3) {
                System.out.println("Oyunu " + pcPuan + "-" + kulPuan + " kaybettiniz");
                break;
            }
        }

    }
}
