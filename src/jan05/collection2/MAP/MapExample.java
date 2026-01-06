/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan05.collection2.MAP;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mousumi Akter
 */
public class MapExample {
    public static void main(String[] args) {
        Map <String, Integer> ages = new HashMap<String, Integer>();
        ages.put("JOHN", 32);
        ages.put("STEVE", 28);
        ages.put("ANGIE", 35);
        ages.put("JESSY", 25);
        ages.put("STEPHEN", 22);
        
        System.out.println("MAP : " + ages);
        int johnAge = ages.get("JOHN");
                System.out.println("JOHN'S AGE : " + johnAge);

        int steveAge = ages.get("STEVE");
                System.out.println("STEVE'S AGE : " + steveAge);

        boolean hasSteve = ages.containsKey("STEPHEN");
                System.out.println("CONTAINS STEVE? : " + hasSteve);



        
    }
}
