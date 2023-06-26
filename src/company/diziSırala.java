package company;

public class diziSırala {
    public void elemanSırala(int[] array){
        int enkucuk;

       for (int i=0;i<array.length-1;i++){
           for (int j=1;j<array.length;j++){
               if (array[j-1]>array[j]){
                   enkucuk=array[j-1];
                   array[j-1]=array[j];
                   array[j]=enkucuk;
               }
           }

       }
       for (int i=0;i<array.length;i++){
           System.out.println("dizinin "+ (i+1)+" elemanı"+ array[i]);
       }
    }
}
