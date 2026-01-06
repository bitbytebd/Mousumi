/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan05.collection3.ITERATOR;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mousumi Akter
 */
public class IteratorTest {
  public static void main(String[] args) {
     ArrayList<Integer> numbers = new ArrayList<>();
             numbers.add(12);
             numbers.add(8);
             numbers.add(22);
             numbers.add(15);
             numbers.add(19);
             numbers.add(7);
             numbers.add(82);

      Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            
            if (next < 10) {
                it.remove();
            }
        }
        System.out.println("MODIFIED LIST WITH HAS NEXT : " + numbers);
        System.out.println("MODIFIED LIST WITH REMOVE : " + numbers);

      }
    }
   

