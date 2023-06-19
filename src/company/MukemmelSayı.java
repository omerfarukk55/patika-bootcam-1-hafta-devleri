package company;

import java.util.Scanner;

public class MukemmelSayı {
    public void hesapla(){
        System.out.println("bir sayı giriniz");
        Scanner scanner=new Scanner(System.in);
        int z=0;
        int sayı=scanner.nextInt();
        for (int i=1; i<sayı;i++){
            if (sayı%i==0){
                z=i;
                z+=z;
            }
            System.out.println(i);
        }

        if (z==sayı){
            System.out.println("bu sayı mükemmel");
        }else
            System.out.println("mükemmel değil");
    }
}
