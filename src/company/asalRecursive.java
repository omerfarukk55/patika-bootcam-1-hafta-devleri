package company;

public class asalRecursive {
    public int asalsayı(int sayı,int n){
     int i=n;
     if (sayı/i==1){
         return 0;
     }
     if (sayı==1){
         return 1;
     }
     i=++i;
     if (sayı%i==1){
           return 0;
       }
     if (sayı%i==0){
           return 1;
       }
     return asalsayı(sayı,i);
    }
}
