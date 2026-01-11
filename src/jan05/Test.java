/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan05;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
/**
 *
 * @author Tultuli
 */
public class Test {
    public static void main(String[] args) {
        
        Person p1 = new Person(1001, "MR.A", 55000);
        Person p2 = new Person(1002, "MR.B", 58500);
        Person p3 = new Person(1003, "MR.C", 65000);

        
     List <Person> personList = new ArrayList<Person>();
     
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            
            
             
             
//       System.out.println(personList);
          
         for(Person obj : personList){
               System.out.println(obj);
           }  
      
       
         
       }
    }
