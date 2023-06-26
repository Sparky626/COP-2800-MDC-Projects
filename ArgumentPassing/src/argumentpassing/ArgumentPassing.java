/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentpassing;

/**
 *
 * @author geovanny.ortiz001
 */

class C{
    
}

class B{
    public int b;
    B(){
    b = 42;
    System.out.println("b = " + b);
    C c = new C();
    System.out.println(c);
   }
    B(int b){
        this.b = b;
    }
}




public class ArgumentPassing {

    public void passInt(int i){
        i = 75;
        System.out.println("i = " + i);
    }
    
    public void passObject(B bb){
        bb.b = 101;
        System.out.println("b = " + bb.b);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 20;
        ArgumentPassing ap = new ArgumentPassing();
        ap.passInt(i);
        System.out.println("i = " + i);
        B myFirstB = new B();
        ap.passObject(myFirstB);
        System.out.println(myFirstB.b);
        
    }
    
    
}
