/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalparametre;

/**
 *
 * @author samet
 */
public class Finalparametre {

    public static int topla(final int a,final int b){
        //a=5;
        //b=9;
        return a+b;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if ((args.length !=2)) {
            System.out.println("Eksik veri girildi");
            System.exit(-1);
        }
        
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int sonuc=Finalparametre.topla(a, b);
        System.out.println("sonuc : "+sonuc);
    }
    
}
