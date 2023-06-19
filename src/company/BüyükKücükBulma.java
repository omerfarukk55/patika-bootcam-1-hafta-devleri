package company;

import java.util.Scanner;

public class BüyükKücükBulma {
    public void bulma(){

        Scanner scanner=new Scanner(System.in);
        int z = scanner.nextInt();
        int[] dizi=new int[z];
        int enbuyuk=dizi[0];
        int enkucuk=dizi[0];
        for (int i=0;i<z;i++){
            dizi[i]=scanner.nextInt();
        }
        for(int j=0;j<dizi.length;j++){

                if (dizi[j]<enkucuk){
                    enkucuk=dizi[j];
                }
                if (dizi[j]>enbuyuk){
                    enbuyuk=dizi[j];
                }

        }
        System.out.println("enbuyuk : "+enbuyuk);
        System.out.println("enkucuk  : "+enkucuk);


    }
}
