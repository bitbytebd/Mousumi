/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan08.file;

import java.io.File;

/**
 *
 * @author Tultuli
 */
public class FileRename {
    public static void main(String[] args) {
        
        File oldfile = new File("D:\\t.txt");
        
        File newfile = new File("D:\\test.txt");
        
     if(oldfile.renameTo(newfile)){
           System.out.println("RENAME IS OCCURED");
      }else{
          System.out.println("RENAME IS FAILED");

      }
        
    }
}
