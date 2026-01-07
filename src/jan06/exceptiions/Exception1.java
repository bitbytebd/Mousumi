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
public class Exception1 {
    public static void main(String[] args) {
        try {
            int a = 12/0;
            System.out.println(a);
            
            String name = null;
             System.out.println(name.length());
             
           int [] arr = {15, 22}; 
            System.out.println(arr[3]);

        } catch (ArithmeticException e) {
            System.out.println("ARITMATIC EXCEPTION IS HANDLED");
            
        }catch(NullPointerException e){
            System.out.println("NULL POINTER EXCEPTION IS HANDLED");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ARRAY OUT OF BOUNDS EXCEPTION IS HANDLED");

        }finally{
            System.out.println(" FINALLY BLOCK ALWAYS EXECUTABLE");

        }
    }
}
