/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tultuli
 */
public class Test {
    public static void main(String[] args) {
        
 
  
        Person p1 = new Person(101, "MR.A", new PersonSalary(25000, 25000, "NORMAL"), new PersonAddress("15/C, MONIPURIPARA", 102, "TEJGAON, DHAKA"));
        Person p2 = new Person(102, "MR.B", new PersonSalary(27000, 35000, "NORMAL"), new PersonAddress("18/X, BANANI", 102, "TEJGAON, DHAKA"));
        Person p3= new Person(103, "MR.C", new PersonSalary(29000, 45000, "NORMAL"), new PersonAddress("56/B, DHANMONDI", 102, "DHANMONDI, DHAKA"));
        Person p4 = new Person(104, "MR.D", new PersonSalary(32000, 75000, "NORMAL"), new PersonAddress("65/A, FARMGATE", 102, "TEJGAON, DHAKA"));
        Person p5 = new Person(105, "MR.E", new PersonSalary(62000, 88000, "NORMAL"), new PersonAddress("88/P, PALTAN", 102, "OLD-DHAKA"));

List<Person> personList = new ArrayList<>();
       personList.add(p1);
       personList.add(p2);
       personList.add(p3);
       personList.add(p4);
       personList.add(p5);
       
        for (Person person : personList) {
            System.out.println(person);
        }


       }

     }

