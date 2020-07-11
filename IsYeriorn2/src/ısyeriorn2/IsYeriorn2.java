/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ısyeriorn2;

/**
 *
 * @author samet
 */

class Calisan{
    public String pozisyon="Calisan";
    public void calis(){
    }
}

class Mudur extends Calisan{
    public String pozisyon ="Mudur";
    public Mudur(){
        pozisyon="Mudur";
    }
    public void calis(){
        System.out.println("Mudur Calisiyor");
    }
}

class Programci extends Calisan{
    public String pozisyon="Programci";
    public Programci(){
        pozisyon="Programci";
    }
    
    public void calis(){
        
    }
}

class Pazarlamaci extends Calisan{
    public String pozisyon="Pazarlamaci";
    public Pazarlamaci(){
        pozisyon="Pazarlamaci";
    }
    public void calis(){
}
}

public class IsYeriorn2 {

    public static void mesaiBasla(Calisan[] c){
        for (int i = 0; i < c.length; i++) {
            c[i].calis();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calisan[] c=new Calisan[4];
        c[0]=new Calisan();
        c[1]=new Programci();
        c[2]=new Mudur();
        c[3]=new Pazarlamaci();
    }
    
}
