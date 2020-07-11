package bas_harf;

import java.util.Scanner;

class Islem{
    
    public Islem(String deger){
        char harf;
        harf=deger.toUpperCase().charAt(0);
        for(int i=1; i<=deger.length(); i++){
            for (int j = 0; j < i; j++) {
                System.out.print(harf);
            }
            for (int k = 0; k < 1; k++) {
                System.out.println(" ");
            }
        }
        
    }
}

public class Bas_harf {
    
    Islem ss=new Islem("Samet");
    public static void main(String[] args) {
        
        Bas_harf s1=new Bas_harf();
        s1.ss.toString();
    } 
}
   
   
