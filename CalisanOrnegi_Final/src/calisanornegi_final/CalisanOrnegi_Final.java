/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanornegi_final;

/**
 *
 * @author samet
 */

interface calisan{

    public void calis();
}

class mudur implements calisan{

    public void calis(){
    
        System.out.println("Mudur sınıfı çalışıyor.");
    }
}

class programci implements calisan{

    public void calis(){
    
        System.out.println("Programcı sınıfı çalışıyor.");
    }
}

class Pazarlamaci implements calisan{

    public void calis(){
    
        System.out.println("Pazarlamacı sınıfı çalışıyor.");
    }
}

class Sekreter implements calisan{

    public void calis(){
    
        System.out.println("Sekreter sınıfı çalışıyor.");
    }
}

class genelMudur extends mudur{

    public void calis(){
    
        System.out.println("Genel mudur sınıfı çalışıyor.");
    }
    
    public void toplantiYonet(){
    
          System.out.println("Gunel Mudur toplantıda.");  
    }
}

class AnalizProgramci extends programci{

    public void AnalizYap(){
    
        System.out.println("AnalizProgramci analiz yapıyor.");
    }
}

class SistemProgramci extends programci{

    public void SistemiIncele(){
    
        System.out.println("SistemProgramci sistemi inceliyor.");
    }
}


public class CalisanOrnegi_Final {
    
    public static void mesaibasla(calisan[] c){
    
        for (int i = 0; i < c.length; i++) {
            c[i].calis();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        calisan[] c=new calisan[7];
        
        c[0]=new mudur();
        c[1]=new genelMudur();
        c[2]=new programci();
        c[3]=new AnalizProgramci();
        c[4]=new SistemProgramci();
        c[5]=new Sekreter();
        c[6]=new Pazarlamaci();
        mesaibasla(c);
    }
    
}
