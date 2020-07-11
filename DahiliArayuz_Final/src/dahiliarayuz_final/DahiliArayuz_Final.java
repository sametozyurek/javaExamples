/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahiliarayuz_final;

/**
 *
 * @author samet
 */

interface ArayuzA{

    interface DahiliArayuz1{
    
        public void isYap1();
    }
    
    interface DahiliArayuz2{
    
        public void isYap2();
    }
}

abstract class Erisim1 implements ArayuzA.DahiliArayuz1{

    public void isYap(){
    
        System.out.println("Erisim1 sınıfı.");
    }
}

abstract class Erisim2 implements ArayuzA.DahiliArayuz2{

    public void isYap(){
        System.out.println("Erisim2 sınıfı.");
    }
}

public class DahiliArayuz_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
