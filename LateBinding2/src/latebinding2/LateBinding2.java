/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latebinding2;

/**
 *
 * @author samet
 */

class Memeli{

    public void Beslen(){
    
        System.out.println("Memeli sınıfı besleniyor.");
    }
}

class Kedi extends Memeli{

    @Override
    public void Beslen(){
    
        System.out.println("Kedi sınıfı besleniyor");
    }
}

class Insan extends Memeli{

    @Override
    public void Beslen(){
        
        System.out.println("Insan sınıfı besleniyor.");
    }
}


class At extends Memeli{

    @Override
    public void Beslen(){
    
        System.out.println("At sınıfı besleniyor.");
    }
}



class LateBinding2 {

    static public void Yazdir(Memeli memeli){
        
        memeli.Beslen();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kedi ks=new Kedi();
        Insan is=new Insan();
        At as=new At();
        
        Yazdir(ks);
        Yazdir(is);
        Yazdir(as);
    }
    
}
