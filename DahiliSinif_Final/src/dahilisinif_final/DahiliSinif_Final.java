/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahilisinif_final;

/**
 *
 * @author samet
 */

class Aile{

    class Baba{
        public void konus(){
            System.out.println("Baba.konus()");
        }
    }
    
    class Anne{
        
        public void konus(){
            System.out.println("Anne.konus()");
        }
    }
}

class Cekirdek extends Aile.Baba{

    public void konus(){
        System.out.println("Cekirdek.konus()");
    }
    
    public Cekirdek(Aile bb){
        bb.super();
    }
}

public class DahiliSinif_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
