/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalmethod;

/**
 *
 * @author samet
 */

//final ozelligi konuldugu zaman method hicbir şekilde degistirilemez olur override edilemez.

class A{
    public final void ekranaYaz(){
        System.out.println("A.ekranaYaz()");
    }
}

class B extends A{
    public static void ekranaYaz(){
        System.out.println("B.ekranaYaz()");
    }
}

public class Finalmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
