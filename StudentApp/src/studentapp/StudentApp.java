/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author geovanny.ortiz001
 */
class Student{
    String name;
    double gpa;
    

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        
    }
    public String toString(){
        return "Student{" + "name = " + name + "GPA = " + gpa + "}";
    }
}
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student("Bill", 2.0);
        Student s2 = new Student("Sam" , 3.5);
        Student s3 = new Student("Geo", 4.0);
        Student array[] = new Student[100];
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        for(Student currentStudent : arrayList){
            System.out.println(currentStudent);
        }
        
    
}
    
}
