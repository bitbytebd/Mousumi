/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan17;

import java.util.Scanner;

/**
 *
 * @author Mousumi Akter
 */
public class MaxMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("HOW MANY NUMBERS NUMBERS ");

        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
          System.out.println("ENTER THE NUMBERS ");
          
        for (int i = 0; i <= 3; i++) {
           int n = sc.nextInt();
            if (n > max){ max = n;}
                    
           
            if (n < min) {min = n;}

              }
        System.out.println("MAX_VALUE = " + max);
         System.out.println("MIN_VALUE = " + min);

    }
}
