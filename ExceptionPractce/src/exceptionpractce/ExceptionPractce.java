/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionpractce;

/**
 *
 * @author geovanny.ortiz001
 */
class A{
    void callMethod() throws Exception{
        System.out.println("callMethod()");
        throw new Exception();
    }
}



public class ExceptionPractce {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    A a = new A();
    try{
    a.callMethod();
    }
    catch(Exception e){
            System.out.println("The exception has been caught");
            e.printStackTrace();
}
    }
}

