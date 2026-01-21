/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan20;

import java.util.*;

/**
 *
 * @author Tultuli
 */
public class LamdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(15);
        
       Collections.sort(list, (a,b) -> a-b);
        System.out.println(list);
    }
}
