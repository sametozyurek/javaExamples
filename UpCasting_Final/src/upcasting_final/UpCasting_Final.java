/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upcasting_final;

/**
 *
 * @author samet
 */

abstract class Memeli{

    public void agirlik(){};
}

interface Besle{

    public void besle();
}

interface Uyu{

    public void uyu();
}

class Kopek extends Memeli implements Besle,Uyu{

    public void agirlik(){
    
        System.out.println("Kopek agirligi 18");
    }
    
    public void besle(){
    
        System.out.println("Kepek beslendi.");
    }
    
    public void uyu(){
    
        System.out.println("Kepek uyudu.");
    }
}


public class UpCasting_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Memeli ms=new Kopek();
        Besle bint=(Besle) new Kopek();
        Uyu uint=(Uyu) new Kopek();
        
        ms.agirlik();
        bint.besle();
        uint.uyu();
    }    
}
