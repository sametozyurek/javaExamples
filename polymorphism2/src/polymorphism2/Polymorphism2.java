/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism2;

/**
 *
 * @author samet
 */

class Hayvan{
    public void avYakala(){
        System.out.println("Hayvan avYakala()");
    }
}

class Kartal extends Hayvan{
    public void avYakala(){
        System.out.println("Kartal avYakala()");
    }
}

class Timsah extends Hayvan{
    public void avYakala(){
        System.out.println("Timsah avYakala()");
    }
}

public class Polymorphism2 {

    public static Hayvan rastgeleSec(){
        int sec=((int)(Math.random()*3));
        Hayvan h=new Hayvan();
        if (sec==0) {
            h=new Hayvan();
        }
        if (sec==1) {
            h=new Kartal();
        }
        if (sec==2) {
            h=new Timsah();
        }
        return h;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hayvan[] h=new Hayvan[3];
        for (int i = 0; i < 3; i++) {//diziyi doldur
            h[i]=rastgeleSec();//upcasting
        }
        
        for (int k = 0; k < 3; k++) {
            h[k].avYakala();//gec baglama
        }
        
        // TODO code application logic here
    }
    
}
