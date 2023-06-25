package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("lütfen boyunuzu (metre cinsinden) giriniz? :");
        double boy = scanner.nextDouble();
        System.out.println("lütfen boyunuzu (metre cinsinden) giriniz? :"+boy);
        int kilo = scanner.nextInt();
        System.out.println("lütfen kilonuzu giriniz ? : "+kilo);
        double index = kilo / ( boy * boy ) ;
        System.out.println("vücut kitle endeksiniz" +index);
        ManavKasaProgramı manavKasaProgramı=new ManavKasaProgramı();
        manavKasaProgramı.girdi();
        UcakBileti ucakBileti=new UcakBileti();
        ucakBileti.hesapla();
        Zodyagı zodyagı=new Zodyagı();
        zodyagı.cinzodyak();
        artıkyıl artık=new artıkyıl();
        artık.hesapla();
        BüyükKücükBulma büyükKücükBulma=new BüyükKücükBulma();
        büyükKücükBulma.bulma();
        MukemmelSayı mukemmelSayı=new MukemmelSayı();
        mukemmelSayı.hesapla();
        yıldız yıldız1=new yıldız();
        yıldız1.yap();
        AsalSayı asalSayı=new AsalSayı();
        asalSayı.bul();
        fibonacci fibb=new fibonacci();
        fibb.fib();
        Scanner scanner1=new Scanner(System.in);
        int m=scanner1.nextInt();
        int s=scanner1.nextInt();
        üslüsayı üslüsayı2=new üslüsayı();
        System.out.println(üslüsayı2.üslüsayı1(m,s));*/
        asalRecursive asal=new asalRecursive();
        Scanner scanner1=new Scanner(System.in);
        int m=scanner1.nextInt();
        if (asal.asalsayı(m)==0){
            System.out.println("sayı asaldır");
        }else System.out.println("sayı  asal değildir");
    }
}
