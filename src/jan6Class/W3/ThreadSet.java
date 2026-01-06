/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan6Class.W3;
import java.util.*;
/**
 *
 * @author Tultuli
 */
public class ThreadSet extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("THREAD CLASS");
        }
    }
    
}


