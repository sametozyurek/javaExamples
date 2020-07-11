/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractandınterface_final;

/**
 *
 * @author samet
 */

abstract class Soyut1{

    abstract public void s1();
}

interface Arayuz1{

    public void a1();
}

interface Arayuz2{

    public void a2();
}


class A extends Soyut1 implements Arayuz1,Arayuz2{

    public void s1(){
    
        System.out.println("A sınıfı s1 metodu.");
    }
    
    public void a1(){
    
        System.out.println("Arayuz1 arayuzu a1 metodu.");
    }
    
    public void a2(){
    
        System.out.println("Arayuz2 a1 metodu.");
    }
}

public class AbstractAndInterface_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        A asinifi=new A();
        asinifi.s1();
        asinifi.a1();
        asinifi.a2();
    }
    
}
