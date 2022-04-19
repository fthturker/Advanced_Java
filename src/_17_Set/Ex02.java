package _17_Set;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrList1=new ArrayList<>();
        ArrayList<Integer> arrList2=new ArrayList<>();

        arrList1=arrListHazirla(10,0,20); //10 tane sayiyi 0 ile 20 arasinda olustur
        arrList2=arrListHazirla(5,0,20);
        System.out.println("10 elemanli list"+arrList1);
        System.out.println("5 elemanli list"+arrList2);

        //arrList1.retainAll(arrList2); // ortak elemanlarini bulmak icin
        //System.out.println("ortak elemanli list "+arrList1);

        //arrList1.removeAll(arrList2); // list1'den list2 cıkarilarak list1 de olup list2 de olmayan
                                      // farkli elemanlarin oldugu list create edildi
        //System.out.println(arrList1);
        //arrList2.removeAll(arrList1);
        //System.out.println(arrList2);

        ArrayList<Integer> arrayListFark1=new ArrayList<>(); // list1 de olup list2 de olmayanlar ---> list1-list2
        ArrayList<Integer> arrayListFark2=new ArrayList<>(); // list1 de olup list2 de olmayanlar ---> list2-list1

       arrayListFark1=arrList1;
       arrayListFark1.removeAll(arrayListFark2);
       System.out.println("farkli list1 "+arrayListFark1);

       arrayListFark2=arrList2;
       arrayListFark2.removeAll(arrayListFark1);
       System.out.println("farkli list2 "+arrayListFark2);


    }

    public static int getRandomInt(int min, int max){ // bu method max ile min arasi sayi return eder
        return(int)(Math.random()*(max-min+1));
    }


    private static ArrayList<Integer> arrListHazirla(int size, int min, int max) { // bu method edilecek arrList size kadar
               // min ile max arasinda int sayi create eder

        ArrayList<Integer> bosList=new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            bosList.add(getRandomInt(min,max));
        }
        return bosList;
    }
}
