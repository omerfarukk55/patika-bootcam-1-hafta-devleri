package company;

import java.util.Scanner;

public class UcakBileti {
    double arac=0.1;
    double biletfiyatı;
    public void hesapla(){
        Scanner scanner=new Scanner(System.in);
        double mesafe = scanner.nextDouble();
        double normalTutar = mesafe*arac;
        int yas = scanner.nextInt();
        double indirimOranı = 0 ;
        if (12<=yas && yas<=24){
             indirimOranı=0.9;
        }else if (yas<12 ){
             indirimOranı=0.5;
        }else if (yas>65){
             indirimOranı=0.7;
        }
        double indirimliTutar = normalTutar * indirimOranı;
         System.out.println("tek yonse bire tıklayn gidiş gelişse 2 tıklayın");
        int tıklanma = scanner.nextInt();
        if( tıklanma == 2 ) {
            biletfiyatı = (int) (indirimliTutar-(indirimliTutar * 0.2));
            biletfiyatı=biletfiyatı*2;
            System.out.println("fiyatı"+biletfiyatı);
        }


    }
}
