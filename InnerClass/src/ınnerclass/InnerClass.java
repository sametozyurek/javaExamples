/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınnerclass;

/**
 *
 * @author samet
 */

public class InnerClass {

    public InnerClass(){
    
        System.out.println("InnerClass Construction.");
    }
    
    public class Human{
    
        public Human(){
        
            System.out.println("Human Construction.");
        }
        
        public class OldMan{
        
            public OldMan(){
            
                System.out.println("OldMan Construction.");
            }
            
            public class GrandSon{
            
                public GrandSon(){
                
                    System.out.println("GrandSon Construction.");
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        InnerClass ics=new InnerClass();
        ics.new Human().new OldMan().new GrandSon();
        
    }
    
}
