package company;

import java.util.Scanner;

public class artıkyıl {
    public void hesapla(){
        Scanner scanner = new Scanner(System.in);
        int yıl= scanner.nextInt();
        int artıkSayı = yıl % 400;
        int artıkSayı1 = yıl % 100;
        int artıkSayı2 = yıl % 4;

        if (!(artıkSayı  ==  0)){
            if (!(artıkSayı1  ==  0)){ if (artıkSayı2  ==  0){
                System.out.println(yıl+ "artık yıldır");
            }
            }
        }else{
            System.out.println("artık değil");
        }

    }
}
