package _00_denemeler;

import java.util.*;

public class Q02_List {
    /*TASK :
       2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
       listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
       Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
          Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

        */
    public static void main(String[] args) {
        String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

        yenidenList(isim);
    }

    private static void yenidenList(String[][] isim) {
        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < isim.length; i++) { // katlarin kont.
            for (int j = 0; j < isim[i].length; j++) {// daire kont.
                list1.add(isim[i][j]); // girilen katin dairesi list1 'e eklendi
            }
        }
        System.out.println("eski liste : " + list1);

        Collections.sort(list1); // list1'deki elemanlari harf sirasina gore dizer
        System.out.println("yeni liste :" + list1);
    }

}


