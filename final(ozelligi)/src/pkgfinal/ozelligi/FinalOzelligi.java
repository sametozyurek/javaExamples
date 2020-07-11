/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.ozelligi;

/**
 *
 * @author samet
 */

class Kutu{
    int i=0;
}


public class FinalOzelligi {

    final int X_SABIT_DEGER=44;
    final static int Y_SABIT_DEGER=35;
    
    final int A_SABIT_DEGER=(int)(Math.random()*50);
    
    final Kutu k=new Kutu();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FinalOzelligi fo=new FinalOzelligi();
        //asagıdakiler hata vericektir çünkü final degiskenler sadece tek bir deger alabilir
        //fo.X_SABIT_DEGER=15;
        //fo.Y_SABIT_DEGER=20;
        //fo.A_SABIT_DEGER=22;
        
        fo.k.i=35;
        
        System.out.println("X_SABIT_DEGER : "+fo.X_SABIT_DEGER);
        System.out.println("Y_SABIT_DEGER : "+fo.Y_SABIT_DEGER);
        System.out.println("A_SABIT_DEGER : "+fo.A_SABIT_DEGER);
        System.out.println("kutu : "+fo.k.i);
    }
    
}
