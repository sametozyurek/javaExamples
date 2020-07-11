package faktoriyel1;

class Faktoriyel{
    public Faktoriyel(int a){
        int sonuc = 1;
         for (int i = 1; i <= a; i++) {
            sonuc *= i;
        }
         System.out.println(sonuc);
    }
}

public class Faktoriyel1 {

    Faktoriyel ss=new Faktoriyel(7);
    
    public static void main(String[] args) {
        
        Faktoriyel1 s1=new Faktoriyel1();
        s1.ss.toString();       
    } 
}
   
   
