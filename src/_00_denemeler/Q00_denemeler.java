package _00_denemeler;

public class Q00_denemeler {
    public static void main(String[] args) {
        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);
    }
}

