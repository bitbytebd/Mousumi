/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tultuli
 */
public class Employee1 implements Impl {
    
    public Map<Integer, Employee> getEmployees() {
       
       Map<Integer, Employee> map = new HashMap<>();

           map.put(101, new Employee(101, "Rahim", 25000, 25));
           map.put(102, new Employee(102, "Karim", 30000, 28));
           map.put(103, new Employee(103, "Ayesha", 35000, 30));
           map.put(104, new Employee(104, "Mousumi", 40000, 27));

        return map; 
   }
}
