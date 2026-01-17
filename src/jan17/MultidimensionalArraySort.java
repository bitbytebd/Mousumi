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
public class MultidimensionalArraySort {
    public static void main(String[] args) {
        int [][] arr = { {53, 12, 76}, {32, 94, 19}, {99, 21, 5} };
         for (int[] row : arr) {
            Arrays.sort(row);
         }
            for(int[] row : arr) {
              for (int s : row) {
                  System.out.println(s);
             }
             System.out.println();
        }
      }
    }
