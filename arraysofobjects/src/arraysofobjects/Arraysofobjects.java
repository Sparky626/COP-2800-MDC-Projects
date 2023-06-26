/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysofobjects;

import java.util.ArrayList;

/**
 *
 * @author geovanny.ortiz001
 * 
 * 
 * 
 */
class A{
    public int i = 100;
    public String toString(){
        
        return (i + 209) + " is my A \n";
    }
}


public class Arraysofobjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        A a = new A();
        A b = new A();
        A c = new A();
        System.out.println(a.i);
        A allAs[] = new A[3];
        allAs[0] = a;
        allAs[1] = b;
        allAs[2] = new A();
        ArrayList<A> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(new A());
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
            
    }
    
}
}
