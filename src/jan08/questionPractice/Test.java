/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan08.questionPractice;

/**
 *
 * @author Mousumi Akter
 */
 class SwitchCase {
    }

    class A{
        public A() {
            System.out.println("A");
        }
        
       public A(int i) {
           this();
            System.out.println(i);
        }
     }
    
    class B extends A{
       public B() {
       System.out.println("B");
        }
         public B(int i) {
           this();
            System.out.println(i + 3);
        }
    
    } 
    
    public class Test{
     
      public static void main(String[] args) {
//           new B(5);
   int []a = {0, 2, 4, 1, 3};
   for(int i = 0; i <a.length; i++){
       a[i] = a[(a[i] + 3) % a.length];
     }
          System.out.println(a[1]);
       }
     }
