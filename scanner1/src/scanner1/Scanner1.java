package scanner1;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        
        int kenar;
        int kose;
        
        System.out.println("Kenar : ");
        kenar=input.nextInt();
        System.out.println("Kose : ");
        kose=input.nextInt();
        
        int sonuc=kenar*kose;
        System.out.println(sonuc);
    } 
}
   
   
