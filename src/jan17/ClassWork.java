/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan17;

import java.util.Arrays;

/**
 *
 * @author Tultuli
 */
public class ClassWork {
    public static void main(String[] args) {
        int [][] arr = { {10, 15, 4}, {20, 4, 15}, {17, 4, 9} };
        
        for (int i = 0; i < arr.length; i++) {
//       System.out.println(arr[i]);
            int temp[] = arr[i];
            
         Arrays.sort(temp);
            for (int j : temp) {
                System.out.println(j + " ");
            }
           for (int j = 0; j < arr[i].length; j++) {
//             System.out.println(arr[i][j]);
                
            }
            System.out.println();
        }
    }
}
