package company;

import java.util.Scanner;

public class yıldız {
    public void yap(){
        int n,i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        n = input.nextInt();
        for(i=1;i<=n;i++){
            for(j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

