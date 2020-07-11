/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author samet
 */

class Asker{
    public void selamVer(){
        System.out.println("Asker selam verdi.");
    }
}

class Er extends Asker{
    public void selamVer(){
        System.out.println("Er selam verdi.");
    }
}

class Yuzbasi extends Asker{
    public void selamVer(){
        System.out.println("Yuzbasi selam verdi.");
    }
}

public class Polymorphism {

    public static void hazirOl(Asker a){
        a.selamVer();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Asker a=new Asker();
        Er e=new Er();
        Yuzbasi y=new Yuzbasi();
        hazirOl(a);
        hazirOl(e); //yukarı cevrim yani upcasting
        hazirOl(y); // upcasting
    }
    
}
