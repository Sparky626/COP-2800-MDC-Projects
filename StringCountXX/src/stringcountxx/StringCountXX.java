/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcountxx;

/**
 *
 * @author geovanny.ortiz001
 */
public class StringCountXX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    int countXX(String str) {
    int count = 0;
  for (int i = 0; i < str.length()-1; i++) {
   if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'){
     count++;
   }
  }
  return count;
}

    
}
