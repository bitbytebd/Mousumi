/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan6Class.w2;

/**
 *
 * @author Tultuli
 */
public class NullPointerException {
      public static void main(String[] args) {
        String s = null;
        System.out.println(s.length()); // NullPointerException
    }
}

class NullPointerExceptionHandling{
   public static void main(String[] args) {
       String s = null;
       System.out.println(s.length());
       System.out.println("NullPointer exception handled");
    }
}
