/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerpractice;
import java.util.Scanner;

/**
 *
 * @author geovanny.ortiz001
 */
public class ScannerPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>100){
            System.out.println("Large number.");
    }
        else{
            System.out.println("Small number.");
    }
    String name = scanner.next();
        if(name.equals("hello")){
            System.out.println("Hi");
    }
        else{
            System.out.println("Okay");
        }
    }
}
