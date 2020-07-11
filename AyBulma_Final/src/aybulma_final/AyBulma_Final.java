/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aybulma_final;

/**
 *
 * @author samet
 */

interface Aylar{

    int Ocak=1, Subat=2, Mart=3, Nisan=4, Mayıs=5, Haziran=6, Temmuz=7, Agustos=8, Eylul=9, Ekim=10;
}

public class AyBulma_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ay=(int)(Math.random()*11);
        switch(ay){
        
            case Aylar.Ocak : System.out.println("Ocak");break;
            case Aylar.Subat : System.out.println("Şubat");break;
            case Aylar.Mart : System.out.println("Mart");break;
            case Aylar.Nisan : System.out.println("Nisan");break;
            case Aylar.Mayıs : System.out.println("Mayıs");break;
            case Aylar.Haziran : System.out.println("Haziran");break;
            case Aylar.Temmuz : System.out.println("Temmuz");break;
            case Aylar.Agustos : System.out.println("Ağustos");break;
            case Aylar.Eylul : System.out.println("Eylül");break;
            case Aylar.Ekim : System.out.println("Ekim");break;
            default : System.out.println("Tanımsız kullanım.");
        }
    }
    
}
