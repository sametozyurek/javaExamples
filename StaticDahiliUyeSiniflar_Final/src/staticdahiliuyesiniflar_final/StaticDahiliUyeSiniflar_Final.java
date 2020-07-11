/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdahiliuyesiniflar_final;

/**
 *
 * @author samet
 */

class Hesaplama4{

    int sabit=2;
    private int ozelsabit=1;
    
    public void ekranaBas(){
    
        System.out.println("Hesaplama4.ekranaBas()");
    }
    
    public static class Toplama4{
    
        static int toplam;
        int sonuc;
        
        public int toplamaYap(int a,int b){
        
            return (a+b);
        }
    }//class toplama4 sonu
    
    public class Cikarma4{
    
        int sonuc;
        
        public int cikarmaYap(int a,int b){
        
            sonuc=a-b;
            return sonuc;
        }//class cikarma4 sonu
    }
    
    public static void main(String[] args){
    
        Toplama4 ts=new Toplama4();
        ts.toplamaYap(5, 6);
        
    }
}//class hesaplama4 sonu

public class StaticDahiliUyeSiniflar_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
