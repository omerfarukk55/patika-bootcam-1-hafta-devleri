package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen boyunuzu (metre cinsinden) giriniz? :");

        double boy = scanner.nextDouble();

        System.out.println("lütfen boyunuzu (metre cinsinden) giriniz? :"+boy);
        int kilo = scanner.nextInt();
        System.out.println("lütfen kilonuzu giriniz ? : "+kilo);
        double index = kilo / ( boy * boy ) ;
        System.out.println("vücut kitle endeksiniz" +index);
    }
}
