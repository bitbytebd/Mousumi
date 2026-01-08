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
public class FileDelete {
    public static void main(String[] args) {
        try {
            File newfile = new File("D:\\test.txt");
            
            if (newfile.delete()) {
                System.out.println("FILE IS DELETED");
            } else {
                System.out.println("FILE IS NOT DELETED");

            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
