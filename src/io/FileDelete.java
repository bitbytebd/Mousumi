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
public class FileDelete {
    public static void main(String[] args) {
        try {
             File newFile = new File("G:\\code_java.txt");
        if (newFile.delete()) {
             System.out.println("FILE IS DELETED SUCCESSFULLY");
       } else {
             System.out.println("FILE IS DELETED SUCCESSFULLY");
            }
          }catch(Exception e){
             e.getStackTrace();
             }
    }
}
