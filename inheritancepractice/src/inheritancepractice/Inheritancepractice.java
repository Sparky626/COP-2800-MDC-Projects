/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author geovanny.ortiz001
 */

class SuperClass
{
    int i = 100;
    public void doThis(){
        System.out.println("We can do this");
    }
}

class SubClass extends SuperClass{
  int s = 20;
 
 public void doThisToo(){
     System.out.println("We can also do this");
 }
}
public class Inheritancepractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SubClass s = new SubClass();
        SuperClass sc = new SuperClass();
        s.doThis();
        sc.doThis();
        s.doThisToo();
        System.out.println(s.i);
        System.out.println(sc.i);
        System.out.println(s.s);
        
        
    }
    
}
