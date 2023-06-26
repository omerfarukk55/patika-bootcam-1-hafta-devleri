package company;

public class frekans {
    public void frekansı(int[] sıra){
        int y=1;
        int z=1;
        int d=1;
        for (int i=0;i< sıra.length;i++){
            if (i==0){
                for (int j=1;j<sıra.length;j++){
                    if ((sıra[i]==sıra[j])&&(i!=j)){
                    y++;
                    }
                }
                System.out.println(sıra[i]+" bu sayı "+y+" bu kadar tekrar etmiştir");
            }else if (sıra[i]!=sıra[i-1]){
                for (int j=0;j< sıra.length;j++){
                    if ((sıra[i]==sıra[j])&&(i!=j)){
                        y++;
                    }
                }
                System.out.println(sıra[i]+" bu sayı şu kadar tekrar etdi "+y);
            }y=1;

            }
        System.out.println();

        }
    }

