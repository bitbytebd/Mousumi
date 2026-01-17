/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan17;

import java.util.Arrays;

/**
 *
 * @author Mousumi Akter
 */
public class ReverseArraySort {
    public static void main(String[] args) {
        int [] arr = {6, 23, 98, 12, 45};
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0 ; i--) {
            
            int b = arr[i];
          System.out.println(b);

        }
    }
}
