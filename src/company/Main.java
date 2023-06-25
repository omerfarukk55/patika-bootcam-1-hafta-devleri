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
        System.out.println(üslüsayı2.üslüsayı1(m,s));
        asalRecursive asal=new asalRecursive();
        Scanner scanner1=new Scanner(System.in);
        int m=scanner1.nextInt();
        int n=2;
        if (asal.asalsayı(m,n)==0){
            System.out.println("sayı asaldır");
        }else System.out.println("sayı  asal değildir");
        Scanner scanner1=new Scanner(System.in);
        int m=scanner1.nextInt();
        SAYDIR saydir=new SAYDIR();
        int n=m;
        saydir.diz(n,m);*/
        Scanner scanner1=new Scanner(System.in);
        String m=scanner1.nextLine();
        double s=scanner1.nextDouble();
        int h= scanner1.nextInt();
        int y = scanner1.nextInt();


      Employee employee=new Employee(m,s,h,y);
      employee.toString1();
    }
}
