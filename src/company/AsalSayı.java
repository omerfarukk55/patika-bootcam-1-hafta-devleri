package company;

import java.util.Scanner;

public class AsalSayı {
    public void bul(){
        Scanner scanner=new Scanner(System.in);
        int sayı = 100;
        boolean asal;
        for (int i=2;i<=sayı;i++){
            asal=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    asal=false;
                    break;
            }

            }

            if (asal){
                System.out.printf("%d ",i);
            }

        }


    }
}
