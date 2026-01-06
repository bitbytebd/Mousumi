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
public class ThreadByClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Converted Into Thread Class");
        }
    }

    private static interface Runable {
    }

   
    
    class ThreadByInterface implements Runable{
       
    
    }

     public static void main(String[] args) {
            
        }
  
 
}
