/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan17;

import java.util.Properties;

/**
 *
 * @author Mousumi Akter
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);
    }
}
