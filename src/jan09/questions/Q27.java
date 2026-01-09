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
public class Q27 {
    public static void main(String[] args) {
        AA a = new BB();
        a.printValue();
        System.out.println(a.i);
        
        
         AA a1 = new AA();
         a1.printValue();
        System.out.println(a1.i);
        
         
   
    }
}

class AA{
  int i = 10;
   public void printValue(){
       System.out.println("AA");
       
 

   }
}
class BB extends AA{
      int i = 12;

 public void printValue(){
//       System.out.println("BB");
              System.out.println("class BB");

   }

}
