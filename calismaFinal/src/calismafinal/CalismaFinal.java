/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calismafinal;

/**
 *
 * @author samet
 */

interface Zemin{
    public interface zeminRenk{
    
        public void renkSec();
    }
    
    public interface arkaResim{
    
        public void resimSec();
    }
}

class InternetSayfası implements Zemin.zeminRenk{

    @Override
    public void renkSec(){
    
        System.out.println("Seçilen renk 'Turuncu' ");
    }
}

class ArkaPlan implements Zemin.arkaResim{

    @Override
    public void resimSec(){
    
        System.out.println("Seçilen arkaplan resmi yok.");
    }
}

public class CalismaFinal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InternetSayfası iss=new InternetSayfası();
        ArkaPlan aps=new ArkaPlan();
        
        iss.renkSec();
        aps.resimSec();
    }
    
}
