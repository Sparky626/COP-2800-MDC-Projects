/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpractice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author geovanny.ortiz001
 */
class A {

    String s;
    int i;

    public A(String s, int i) {
        this.s = s;
        this.i = i;
    }
}

public class TestPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A myA = new A("test", 0);
        ArrayList<A> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        int Choice;
        int quit = 0;
        while (exit == true) {
            System.out.println("If you want to Enter an Object enter 1");
            quit = scanner.nextInt();
            if (quit == 1) {
                System.out.println("Enter Object Name and Int");
                list.add(new A(scanner.next(), scanner.nextInt()));
            } else {
                exit = false;

            }
        }
        for (A a : list){
            if(a.i > 10){
                System.out.println(a.s + " " + a.i);
            }
        }

    }

}
