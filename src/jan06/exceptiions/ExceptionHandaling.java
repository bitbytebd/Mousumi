/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06.exceptiions;

/**
 *
 * @author Mousumi Akter
 */
public class ExceptionHandaling {
      public static void main(String[] args) {

        try {
            int a = 10 / 0;           // ArithmeticException
            String s = null;
            s.length();              // NullPointerException
            int[] arr = {1, 2};
            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled");

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception handled");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception handled");

        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
