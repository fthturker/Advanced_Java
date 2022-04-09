package _14_Encapsulation.Q01;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda = new Araba();//p'siz obj create edildi
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setMotor(1600);
        honda.setRenk("kırmızı");

        Araba toyota = new Araba("avensis", "beyaz", 300, -2020);//p'li obj create edildi
        Araba volvo = new Araba("s80", "füme", 2400, 2010);//p'li obj create edildi
        Araba haciMurat = new Araba(1200, 1974);
        System.out.println("honda ne ararsan var onda "+honda);//toString() methodu olmazsa bu obj referns değeri print eder
        System.out.println("volvo  aracı "+volvo);
        System.out.println("sectiginiz arac toyota -> " + " modeli :" + toyota.getModel() + " renk :" + toyota.getRenk() +
                " motor gücü : " + toyota.getMotor() + " yılı : " + toyota.getYil());

    }
}

