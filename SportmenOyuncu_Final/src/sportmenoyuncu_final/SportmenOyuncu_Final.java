/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportmenoyuncu_final;

/**
 *
 * @author samet
 */

interface BuzUstundeKayabilme{

    public void buzUstundeKay();
}

interface Yuzebilme{

    public void suyaDal();
}

class SportmenOyuncu implements BuzUstundeKayabilme,Yuzebilme{

    public void buzUstundeKay(){
    
        System.out.println("Buzda kay.");   
    }
    
    public void suyaDal(){
    
        System.out.println("Suya dalış yap.");
    }
}

public class SportmenOyuncu_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SportmenOyuncu sos=new SportmenOyuncu();
        
        sos.buzUstundeKay();
        sos.suyaDal();
    }  
}
