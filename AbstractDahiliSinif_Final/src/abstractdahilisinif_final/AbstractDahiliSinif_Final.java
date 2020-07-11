/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdahilisinif_final;

/**
 *
 * @author samet
 */

class Hayvan{

    public void avlan(){
    
        System.out.println("Hayvan.avlan()");
    }
    
    abstract class Kus{
    
        abstract public void uc();
        abstract public void kon();
    }
}

class Kartal extends Hayvan.Kus{

    public void uc(){
    
        System.out.println("Kartal.uc()");
    }
    
    public void kon(){
    
        System.out.println("Kartal.kon()");
    }
    
    public Kartal(Hayvan ks){
    
        ks.super();
    }
}

public class AbstractDahiliSinif_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hayvan hs=new Hayvan();
        Kartal ks=new Kartal(hs);
        
        ks.uc();
        ks.kon();
    }
    
}
