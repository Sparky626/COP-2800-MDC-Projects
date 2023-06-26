/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

import java.util.ArrayList;

/**
 *
 * @author geovanny.ortiz001
 */
public class Student {
    private double gpa;
    private String name;

    public Student(double gpa, String name) {
        this.gpa = gpa;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student{" + "gpa=" + gpa + ", name = " + name + '}';
    }
}
class GraduateStudent extends Student{
    private boolean finishedDissertation;
    public GraduateStudent(boolean finishedDissertation, double gpa, String name) {
        super(gpa, name);
        this.finishedDissertation = finishedDissertation;
        
        
    }

    @Override
    public String toString() {
        return "GraduateStudent{" + "finishedDissertation=" + finishedDissertation + '}' +
        super.toString();
    }
    
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(new Student(3.5, "Jim"));
        al.add(new GraduateStudent(true, 4.0, "Jack"));
        for (Object object : al){
            System.out.println(object);
        }        
        
        
            
    
    
    }
    
}


