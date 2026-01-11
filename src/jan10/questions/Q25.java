/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan10.questions;

/**
 *
 * @author Mousumi Akter
 */
public class Q25 {
    public static void main(String[] args) {
        P p = new C();
        
        p.method();
    }
}
class P{
   static void method(){
       System.out.println("class Parent method");
   }
}

class C extends P{
    static void method(){
       System.out.println("class child method");
   }

}