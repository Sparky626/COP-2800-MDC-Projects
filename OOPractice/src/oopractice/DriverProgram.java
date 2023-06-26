/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopractice;

/**
 *
 * @author geovanny.ortiz001
 */
import java.util.Scanner;
public class DriverProgram {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getS());
        a.setS("Blah blah");
        System.out.println("Enter the value of s:");
        Scanner s = new Scanner(System.in);
        a.setS(s.nextLine());
        System.out.println(a.getS());
    }
}

