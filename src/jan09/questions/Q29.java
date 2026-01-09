/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan09.questions;

/**
 *
 * @author Mousumi Akter
 */
public class Q29 {
    
    public static void main(String[] args) {
        B1 b = new B1();
        C1 c = new C1();
        
        newPrint(b);
        newPrint(c);

    }
    public static void newPrint(A1 a){
       a.printValue();
       
    }
}

class A1{

    public void printValue() {
        System.out.println("value a1");
    }
}
class B1 extends A1{
     public void printName() {
        System.out.println("name b1");
    }
}
class C1 extends A1{
     public void printName() {
        System.out.println("name c1");
    }
}