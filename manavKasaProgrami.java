import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double elma,armut,muz,domates,patlican,toplam;

        Scanner inp = new Scanner(System.in);

        System.out.println("elma kaç kilo? :");
        elma = inp.nextDouble();

        System.out.println("armut kaç kilo ? :");
        armut = inp.nextDouble();

        System.out.println("muz kaç kilo ? :");
        muz = inp.nextDouble();

        System.out.println("domates kaç kilo ? :");
        domates = inp.nextDouble();

        System.out.println("patlıcan kaç kilo ? :");
        patlican = inp.nextDouble();

        toplam = elma*3.67 + armut*2.14 + muz*0.95 + domates * 1.11 + patlican*5.00;

        System.out.println("toplam tutar :" + toplam);


    }
}

