/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan08.file;

import java.io.File;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author Tultuli
 */
public class FileCreate {
    public static void main(String[] args) {
        try {
          File file = new File("D:\\t.txt");
          
              if(file.createNewFile()){
                  System.out.println("NEW FILE IS CREATED");
              }else{
              
                System.out.println("NEW FILE IS NOT CREATED");
              }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
