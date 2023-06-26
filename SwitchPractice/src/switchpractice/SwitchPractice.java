/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchpractice;

/**
 *
 * @author geovanny.ortiz001
 */
import java.util.Scanner;
public class SwitchPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        int userNum = scanner.nextInt();
        switch (userNum){
            case 100:
                System.out.println("Great Number!");
                break;
            case 50:
                System.out.println("Super choice!");
                break;
            default:
                System.out.println("Try again.");
        }
    }
    
}
