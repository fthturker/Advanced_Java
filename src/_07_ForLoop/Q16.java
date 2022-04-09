package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

        int harf = 65; // 65 yazilmasi A dan baslaması icin 66 yazilsaydi B den baslayacakti
        for (int i = 0; i < 6; i++) { //satır kontrolu

            for (int j = 0; j <= i; j++) {//sutun kontrolu
                System.out.print((char) (harf + i) + " ");
            }
            System.out.println();
        }
    }

}
