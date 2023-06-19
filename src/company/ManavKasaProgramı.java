package company;

import java.util.Scanner;

public class ManavKasaProgramı {
    double Armut = 2.14 ;
    double Elma = 3.67;
    double Domates = 1.11;
    double Muz= 0.95 ;
    double Patlıcan = 5.00 ;
    Scanner scanner=new Scanner(System.in);
    public void girdi(){
        System.out.println("armut kac kilo ? : ");
        int kilo = scanner.nextInt();
        System.out.println("elma kac kilo ? : ");
        int kilo1 = scanner.nextInt();
        System.out.println("domates kac kilo ? : ");
        int kilo2 = scanner.nextInt();
        System.out.println("muz kac kilo ? : ");
        int kilo3 = scanner.nextInt();
        System.out.println("patlican kac kilo ? : ");
        int kilo4 = scanner.nextInt();
        double toplam = kilo*Armut + kilo1*Elma + kilo2*Domates + kilo3*Muz + kilo4*Patlıcan;
        System.out.println("toplam tutar: "+toplam);
    }
}
