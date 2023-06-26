/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedifpractice;

/**
 *
 * @author geovanny.ortiz001
 */
public class NestedIfPractice {
    
    public String findGrade(int score){
        if(score >= 60){
            return "You Passed! :)";
        }
        else{
            return "You Failed :(";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NestedIfPractice np = new NestedIfPractice();
        System.out.println(np.findGrade(60));
        System.out.println(np.findGrade(59));
        boolean b = true;
        int i = 30;
        if(b){
            if(i < 20){
                System.out.println("Hello");
            }
        }
        // TODO code application logic here
    }
    
}
