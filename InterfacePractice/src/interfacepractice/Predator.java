/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepractice;

/**
 *
 * @author geovanny.ortiz001
 */
public interface Predator {
    void stalkPrey();
    void kill();
    void hunt();
    
}

class Tiger implements Predator{
    public void growl(){
        System.out.println("The tiger growls at its rival.");
    }
    @Override 
    public void stalkPrey(){
        System.out.println("Silently the tiger creeps up...");
    }
    @Override
    public void kill(){
        System.out.println("Tigers kill extremely efficiently.");
    }
    @Override
    public void hunt(){
        System.out.println("Tigers are solitary hunters.");
    }
}
