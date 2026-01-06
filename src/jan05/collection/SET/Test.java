/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan05.collection.SET;

import java.util.*;

/**
 *
 * @author Tultuli
 */
public class Test {
    public static void main(String[] args) {
        Employer emp1 = new Employer(101, "MOUSUMI", 87000);
        Employer emp2 = new Employer(102, "RAHIMA", 55000);
        Employer emp3 = new Employer(103, "KEYA", 76000);
        Employer emp4 = new Employer(104, "PAYEL", 45000);
        Employer emp5 = new Employer(105, "KONA", 67000);

        Set <Employer> set = new HashSet<> ();
              set.add(emp1);
              set.add(emp2);
              set.add(emp3);
              set.add(emp4);
              set.add(emp5);
        
        
        for (Employer employer : set) {
            System.out.println(employer);
        }
              
    }
}
