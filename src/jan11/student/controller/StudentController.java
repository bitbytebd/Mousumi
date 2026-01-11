/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.student.controller;

import jan11.student.model.Student;
import jan11.student.service.StudentService;

/**
 *
 * @author Mousumi Akter
 */
public class StudentController {
    
    public Student create(Student s) {
       StudentService ss = new StudentService();
        return ss.save(s);
    }
}
