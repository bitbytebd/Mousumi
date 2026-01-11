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
public class Q28 {
      public static void printValue(int i, int j, int k){
          System.out.println("int");
      }
      
       public static void printValue(byte...b){
          System.out.println("long");
      }
    public static void main(String[] args) {
        byte b = 9;
        
        printValue(b,b,b);
    }
    
  
}
