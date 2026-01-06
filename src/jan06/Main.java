/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Tultuli
 */
public class Main {
    public static void main(String[] args) {


        Map<Integer, Employee> empMap = new Employee1().getEmployees();

        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
            System.out.println("KEY (ID): " + entry.getKey());
            System.out.println("VALUE: " + entry.getValue());
            System.out.println("----------------------");
        }
    }
}
