/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan5.THREAD;

/**
 *
 * @author Mousumi Akter
 */
public class ThreadSet {
    void x(){
        System.out.println("X");
       }
    
      void y(){
        System.out.println("Y");
       }
    public static void main(String[] args) {
        ThreadSet tt = new ThreadSet();
            for (int i = 0; i < 3; i++) {
                System.out.println("PRINT X FOR THREE TIMES ");
               tt.x();
              }
        System.out.println("PRINT Y FOR THREE TIMES ");

         for (int i = 0; i < 3; i++) {
               tt.y();
              }
           System.out.println("PRINT X AND Y FOR THREE TIMES ");

          for (int i = 0; i < 3; i++) {
               tt.x();
               tt.y();

              }
    }
}
