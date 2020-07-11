/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oyun;

/**
 *
 * @author samet
 */

class IrkSec{
    public void Warrior(){
        System.out.println("Seçilen ırk Warrior");
    }
    public void Ninja(){
        System.out.println("Seçilen ırk Ninja");
    }
    public void Healer(){
        System.out.println("Seçilen ırk Healer");
    }
    public void Shaman(){
        System.out.println("Seçilen ırk Shaman");
    }
}

class TenRengi{
    void White(){};
    void Black(){};
    void Blonde(){};
    void Auburn(){};
}

class NickName{
    public NickName(String Nick){
        System.out.println("Nick Name : "+Nick);
    }
}

class Kasil{
    int EX=0;
    public void Grind(){
        ++EX; 
    }
}

public class Oyun {
    IrkSec irk=new IrkSec();
    TenRengi ten=new TenRengi();
    NickName name=new NickName("Neutrino");
    Kasil kas=new Kasil();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
           
        Oyun ss=new Oyun();
        ss.irk.Healer();
        ss.ten.Auburn();
        ss.name.toString();
        ss.kas.Grind();
    } 
}
   
   
