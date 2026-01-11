/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.student.service;

import jan11.student.DAO.StudentDAO;
import jan11.student.model.Student;

/**
 *
 * @author Mousumi Akter
 */
public class StudentService {
    
      public Student save(Student s){
       
       StudentDAO sdao = new StudentDAO();
         return sdao.insert(s);
    }

 
}
