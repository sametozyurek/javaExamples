/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karisim_final;

/**
 *
 * @author samet
 */

interface Hayvan{

    public void avlan();
}

abstract class Kedi implements Hayvan{

    abstract public void takipEt();
}

class Kaplan extends Kedi{

    public void takipEt(){
    
        System.out.println("Kaplan sınıfı takip ediyor.");
    }
    
    public void avlan(){
    
        System.out.println("Kaplan sınıfı avlanıyor.");
    }
}

public class Karisim_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kaplan ks=new Kaplan();
        
        ks.takipEt();
        ks.avlan();
    }
    
}
