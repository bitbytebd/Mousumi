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
public class FileRename {
    public static void main(String[] args) {
        File oldFile = new File("G:\\java.txt");
         File newFile = new File("G:\\code_java.txt");
     if(oldFile.renameTo(newFile)){
          System.out.println("RENAME SUCCESSFULL");
     }else{
          System.out.println("RENAME FAILED");

     }
    }
}
