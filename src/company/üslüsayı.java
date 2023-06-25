package company;

import java.util.Scanner;

public class üslüsayı {
    public int üslüsayı1(int n,int i){
        if (i==0){
            return 1;
        }
       return n*üslüsayı1(n,i-1);
    }
}
