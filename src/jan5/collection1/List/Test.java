/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan5.collection1.List;

import java.util.*;

/**
 *
 * @author Mousumi Akter
 */
public class Test {
    public static void main(String[] args) {
      List<Trainee> list = new ArrayList<>();
          list.add(new Trainee(101, "MOUSUMI", "CEO", 89000));
          list.add(new Trainee(102, "MOUMI", "GM", 79000));
          list.add(new Trainee(103, "MEDHA", "AGM", 68000));
          list.add(new Trainee(104, "LIMI", "MD", 56000));

//          System.out.println(list);
          
          for (Trainee list1 : list) {
              System.out.println(list1);
        }
      }
}
