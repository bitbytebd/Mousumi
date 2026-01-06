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
public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
         try {
            int a = 10;
            int b = 0;
            int result = a / b;
         System.out.println(result);
         
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Arithmetic exception handled");
      }
    }
  }


 