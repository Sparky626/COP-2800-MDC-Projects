/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author geovanny.ortiz001
 * 
 * 
 * 
 */

public class IntegerArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ArrayList<Integer> al = new ArrayList<>();
        //ask a user to keep adding numbers to the arraylist until they enter -2
        //after the enter -2, add up all the numbers entered and report back the sum
        //don't include the -2!  
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a whole number.  -2 to quit.");
            int currentNumber = scanner.nextInt();
            if(currentNumber == -2){
                break;
            }
            else{
                al.add(currentNumber);
            }
        }while(true);
        int sum = 0;
        for(int i : al){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }  
}
