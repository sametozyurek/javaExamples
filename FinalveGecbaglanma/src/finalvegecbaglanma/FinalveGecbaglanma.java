/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalvegecbaglanma;

/**
 *
 * @author samet
 */

class Kedi{
    public void avYakala(){
        System.out.println("Kedi sınıfı av yakalıyor.");
    }
}

class Kaplan extends Kedi{
    public static void goster(Kedi k){
        k.avYakala();
    }
    
    public void avYakala(){
        System.out.println("Kaplan sınıfı av yakalıyor.");
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        Kedi k=new Kedi();
        Kaplan kp=new Kaplan();
        goster(k);
        goster(kp);
    }
    
}

public class FinalveGecbaglanma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }
    
}
