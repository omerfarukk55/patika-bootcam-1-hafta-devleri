package company;

public class fibonacci {
    public void fib(){
        int s1 = 0;
        int s2 = 1;
        int sum = 0;

        for (int i=1;i<9;i++){
            sum = s1+s2;
            s1=s2;
            s2=sum;
            System.out.print(sum+" ");

        }
    }
}
