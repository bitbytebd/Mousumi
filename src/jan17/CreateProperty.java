/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Mousumi Akter
 */
public class CreateProperty {
    public static void main(String[] args) {
        Properties prop = new Properties();
        OutputStream output = null;
        
        try {
            output = new FileOutputStream("config.properties");
            
           prop.setProperty("database", "localHost");
           prop.setProperty("dbuser", "user");
           prop.setProperty("password", "123");

            
        } catch (IOException io) {
            io.printStackTrace();
        }finally{
            if (output != null) {
                try {
                    output.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
           
            }
        
        }
        
    }
}
