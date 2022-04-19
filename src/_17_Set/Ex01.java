package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanlari set'e convert eden bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {
        /*
        int[] array1 = {1, 2, 3, 4, 4, 6, 5, 7, 8, 0, 2, 6};
        Set<Integer> set1 = new HashSet<>();
        elementEkle(array1, set1);

    }

    private static void elementEkle(int[] array1, Set<Integer> set1) {
        for (Integer each:array1) {
            set1.add(each);
        }
        setiyazdir(set1);
    }

    private static void setiyazdir(Set<Integer> set1) {
        System.out.println(set1); // [0, 1, 2, 3, 4, 5, 6, 7, 8]

         */
        HashSet<Integer> hs = new HashSet<>();
        int[] arr=new int[]{1,2,3,4,5,6,7};

        elementEkle(hs,arr);
        System.out.println("***");
        elementEkle(hs,new int[]{34,35,45,61,38});
    }

    private static void elementEkle(HashSet<Integer> hs, int[] arr) {
        HashSet<Integer> hs2=new HashSet<>();
        for (Integer sayi:arr) {
            hs.add(sayi);

        }
        yazdir(hs);
    }
    public static void yazdir(HashSet<Integer> hs){
        for (Integer s:hs) {
            System.out.print(s+ " "); // 1 2 3 4 5 6 7
        }
    }
}

