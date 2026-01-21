/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan20;

/**
 *
 * @author Tultuli
 */
public class Recursion {

    static int factorial(int n) { //recursive method
        if (n == 0) {          // base case or condition
            return 1;
        }
        return n * factorial(n - 1); // recursive method call
    }

    public static void main(String[] args) {
       
        int result = factorial(5);
        
        System.out.println("Factorial = " + result);
    }
    
   
}
