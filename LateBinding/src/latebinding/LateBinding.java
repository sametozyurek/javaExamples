/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latebinding;

/**
 *
 * @author samet
 */

class Kisi{
    
    public void benKimim(){
    }
}

class Personel extends Kisi{

    @Override
    public void benKimim(){
        System.out.println("Personel sınıfı.");
    }
}

class Muhendis extends Personel{

    @Override
    public void benKimim(){
    
        System.out.println("Muhendis sınıfı.");
    }
}

class Teknisyen extends Personel{
    
    @Override
    public void benKimim(){
    
        System.out.println("Teknisyen sınıfı.");
    }
}

public class LateBinding {
    
    static public void yazdir(Kisi biri){
    
        biri.benKimim();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personel ps=new Personel();
        Muhendis ms=new Muhendis();
        Teknisyen ts=new Teknisyen();
        
        yazdir(ps);
        yazdir(ms);
        yazdir(ts);
    }
    
}
