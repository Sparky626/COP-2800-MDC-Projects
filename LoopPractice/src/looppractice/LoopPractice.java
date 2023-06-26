/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppractice;

/**
 *
 * @author geovanny.ortiz001
 */
public class LoopPractice {

    /**
     * @param args the command line arguments
     */
    
    public void printNumbers(int stop){
        int counter = 1;
        while (counter <= stop){
            System.out.println(counter);
            counter++;
            
        }
    }
    
    public static void doWhilePractice(int numStart, int numStop){
        int sum = 0;
        do{
            sum += numStart;
            numStart++;
            
        }while(numStart <= numStop);
        System.out.println("Sum = " + sum);
    }
         
    public static void main(String[] args) {
        
        doWhilePractice(1, 4);
        // TODO code application logic here
       // new LoopPractice().printNumbers(100);
    
       // for(int i = 100; i>=0; i--){
          //  System.out.println(i);
        //}
       // if(true){
            //System.out.println("Hello");
        }
    }
    
    
