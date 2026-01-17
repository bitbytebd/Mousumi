/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Mousumi Akter
 */
public class ReadProperty {
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;
        
        try {
          input = new FileInputStream("config.properties");
          
          prop.load(input);
            System.out.println(prop.getProperty("database", "localHost"));
           System.out.println(prop.getProperty("dbuser","user"));
           System.out.println(prop.getProperty("password","123"));
          
          Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
               
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                System.out.println("KEY : " + key + "VALUE" + value);

            }


        } catch (IOException io) {
            io.printStackTrace();
        }finally{
           if(input != null){
               try {
                   input.close();
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
        }
    }

}
