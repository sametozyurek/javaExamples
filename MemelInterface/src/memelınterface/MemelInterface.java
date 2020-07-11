/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memelınterface;

/**
 *
 * @author samet
 */

interface Hareketedebilme{

    public void yuru();
}

interface Beslenebilme extends Hareketedebilme{

    public void beslen();
}

interface Cogalabilme extends Beslenebilme{

    public void cogal();
}

class Memeli implements Cogalabilme{

    @Override
    public void yuru(){
    
        System.out.println("Memeli sınıfı yürüyor.");
    }
    
    @Override
    public void beslen(){
    
        System.out.println("Memeli sınıfı besleniyor.");
    }
    
    @Override
    public void cogal(){
    
        System.out.println("Memeli sınıfı Çoğalıyor.");
    }
}

public class MemelInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Memeli mms=new Memeli();
        mms.yuru();
        mms.beslen();
        mms.cogal();
    }
    
}
