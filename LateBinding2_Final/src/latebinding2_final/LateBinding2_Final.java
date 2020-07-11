/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latebinding2_final;

/**
 *
 * @author samet
 */

class A{

    public void work(){
    
        System.out.println("A sınıfı");
    }
}

class B extends A{

    public void work(){
    
        System.out.println("B sınıfı");
    }
}

class C extends A{

    public void work(){
    
        System.out.println("C sınıfı");
    }
}

class D extends A{

    public void work(){
    
        System.out.println("D sınıfı");
    }
}

public class LateBinding2_Final {

    static public void yazdir(A secim){
    
        secim.work();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        A as=new A();
        B bs=new B();
        C cs=new C();
        D ds=new D();
        
        yazdir(as);
        yazdir(bs);
    }
    
}
