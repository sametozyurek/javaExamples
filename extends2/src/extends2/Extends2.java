/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extends2;

/**
 *
 * @author samet
 */

class Ilac{
    int MG;
    int Adet;
    public Ilac(int mg1,int adet1){
        this.Adet=adet1;
        this.MG=mg1;
        System.out.println("Ilac "+mg1+" MG");
        System.out.println("Kutunun icerisinde "+adet1+" adet hap var");
    }
}

public class Extends2 extends Ilac{
    
    public Extends2(int mg1,int adet1,String ad){
        super(mg1 , adet1);
        System.out.println("Ilacin adi : "+ad);
        System.out.println(" ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Extends2 ss=new Extends2(100,20,"Aferin");
        Extends2 ss1= new Extends2(500,15,"Zoretanin");
    }
    
}
