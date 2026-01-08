/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;

/**
 *
 * @author Tultuli
 */
public class CreateFileExample {
    public static void main(String[] args) {
        try {
           File file = new File("G:\\java.txt");
            if(file.createNewFile()){
                System.out.println("File is created");
            }else{
               System.out.println("File is already existed");

            }
           } catch (Exception e) {
              e.fillInStackTrace();
        }
    }
}
