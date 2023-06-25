package company;

public class SAYDIR {

    boolean lt=true;
    public int diz(int n, int m){
        System.out.println(m + ", ");
    while (lt){
     m=m-5;
    System.out.println(m + ", ");
    if (m <= 0) {lt=false;
    }
    }
    m = m + 5;
    if (n==m){
     System.out.println(m + ", ");
    return 1;
    }
        System.out.println(m + ", ");
        return diz(n,m);
    }
}
