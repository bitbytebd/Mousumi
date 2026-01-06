/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan5.collection3.ITERATOR;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mousumi Akter
 */
public class IteratorUniqueValue {
    private static Object it;
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
               for (int i = 0; i < 10; i++) {
                   set.add(i);
                   
        Iterator<Integer> iUnique = set.iterator();
        
        Map<Integer, String> map = new HashMap<>();
               if (iUnique.hasNext()) map.put(iUnique.next(), "X");
               if (iUnique.hasNext()) map.put(iUnique.next(), "Y");
               if (iUnique.hasNext()) map.put(iUnique.next(), "Z");
      
            // Step 5: Iterate Map and print     
      
      Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
               while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            
            System.out.println("KEY = " + entry.getKey() + " VALUE = " + entry.getValue());
           }     
        }
      
    }
}
