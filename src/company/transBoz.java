package company;

public class transBoz {

    public void trans(int[][] matris){
        int[][] transpoz=new int[3][3];
        for (int i=0;i< matris.length;i++){
            for (int j=0;j<matris[i].length;j++){


                System.out.print(matris[i][j]);
            }
            System.out.println();
        }  for (int i=0;i< matris.length;i++){
            for (int j=0;j<matris[i].length;j++){

                transpoz[i][j]=matris[j][i];
                System.out.print(matris[j][i]);

            }
            System.out.println();
        }


    }
}
