/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;
import java.util.Scanner;
/**
 *
 * @author geovanny.ortiz001
 */
public class Computer {

    /**
     * @param args the command line arguments
     */
    private String brand;
    private int gigram;
    private double cpuspeed;

    public Computer(String brand, int gigram, double cpuspeed) {
        this.brand = brand;
        this.gigram = gigram;
        this.cpuspeed = cpuspeed;
    }

    @Override
    public String toString() {
        return "Computer{" + "Brand = " + brand + ", Ram(in gigs) = " + gigram +
                ", Cpu Speed = " + cpuspeed + '}';
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Brand:");
        String brand = scanner.next();
        System.out.println("Enter Ram in Gbs:");
        int ram = scanner.nextInt();
        System.out.println("Enter cpu speed:");
        double cpu = scanner.nextDouble();
        Computer myComputer = new Computer(brand, ram, cpu);
        System.out.println(myComputer);
    
    
    }
        
}
