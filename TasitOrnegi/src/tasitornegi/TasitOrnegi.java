/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasitornegi;

/**
 *
 * @author samet
 */


class Tasit{

    int Deger1;
    int Deger2;
    int Deger3;
    public void BenNeyim(){
    
        System.out.println("Tasıt sınıfı.");
    }
}

class MotorluTasit extends Tasit{

    public int Deger4;
    
    @Override
    public void BenNeyim(){
    
        System.out.println("Motorlu tasıt sınıfı.");
    }
}

class MotorsuzTasit extends Tasit{

    int Deger4;
    
    @Override
    public void BenNeyim(){
    
        System.out.println("MotursuzTasit sınıfı.");
    }
}

class Taksi extends MotorluTasit{

    @Override
    public void BenNeyim(){
    
        System.out.println("Taksi sınıfı.");
    }
}

class Otobus extends MotorluTasit{

    @Override
    public void BenNeyim(){
    
        System.out.println("otobus sınıfı.");
    }
}

class Bisiklet extends MotorsuzTasit{

    @Override
    public void BenNeyim(){
    
        System.out.println("Bisiklet sınıfı.");
    }
}

public class TasitOrnegi {

    static public void Goster(Tasit tasit){
    
        tasit.BenNeyim();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tasit ts=new Tasit();
        MotorluTasit mts=new MotorluTasit();
        MotorsuzTasit msts=new MotorsuzTasit();
        Taksi tss=new Taksi();
        Otobus os=new Otobus();
        Bisiklet bs=new Bisiklet();
        
        Goster(ts);
        Goster(mts);
        Goster(msts);
        Goster(tss);
        Goster(os);
        Goster(bs);
    }
    
}
