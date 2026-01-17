/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan17;

import java.io.*;




/**
 *
 * @author Mousumi Akter
 */
public class BufferedReader {
    public static void main(String[] args) {
        try {
         FileReader fr = new FileReader("F:\\tesla.txt");
         java.io.BufferedReader br = new java.io.BufferedReader(fr);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            String sCurrentLine;
        
            while ((sCurrentLine = br.readLine()) !=null) {                
                System.out.println(sCurrentLine);
            }
         } catch (Exception e) {
             e.printStackTrace();
        }
    }

  
}
