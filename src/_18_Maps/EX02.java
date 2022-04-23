package _18_Maps;

import java.util.HashMap;
import java.util.Scanner;

public class EX02 {
    /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdiran method creat ediniz.
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz :");
        String metin= scan.nextLine(); // ali gel gel de sevelim seni

        kelimeSay(metin);
        System.out.println(kelimeSay(metin));

    }

    public static HashMap<String,Integer> kelimeSay(String metin) {
        HashMap<String,Integer> kelimesayisi=new HashMap<>();
        String [] arrMetin=metin.split(" "); // metnin herbir kelimesi arraya atandı
        for (int i = 0; i < arrMetin.length; i++) { // arrayin her bir elemani icin dongu acıldı
            if (kelimesayisi.containsKey(arrMetin[i])){ // map'in kelime olan key'inde array den gelen kelime varsa
                                                        //bu kelime daha once map'e eklenip eklenmedigi kontrol ediliyor
                kelimesayisi.put(arrMetin[i],kelimesayisi.get(arrMetin[i])+1); // map'a key olarak kelime value olarak int deger
            }else kelimesayisi.put(arrMetin[i],1 );
        }
        return kelimesayisi;
    }
}
/*
for yerine for each lede yapabiliriz
for (String each:arrMetin
             ) {
            if(metinKelimeSayisi.containsKey(each)){
                metinKelimeSayisi.put(each,metinKelimeSayisi.get(each)+1);
            }else {
                metinKelimeSayisi.put(each,1);

        }
            return metinKelimeSayisi;
 */