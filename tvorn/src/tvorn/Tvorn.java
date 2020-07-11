/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvorn;

/**
 *
 * @author samet
 */

final class Televizyon{
    public void kanalBul(){
        
    }
}

//final method ile katılım yapılamaz
class Supertv extends Televizyon{
    
}

class Ev{
    int oda_sayisi=5;
    Televizyon tv=new Televizyon();
    public static void main(String args[]){
        Ev e=new Ev();
        e.tv.kanalBul();//kompozisyon
    }
}

public class Tvorn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
