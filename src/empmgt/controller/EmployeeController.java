/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.controller;

import model.Employee;
import service.EmployeeService;

/**
 *
 * @author Tultuli
 */
public class EmployeeController {
    public Employee create(Employee e){
        
        EmployeeService es = new EmployeeService();
           return es.save(e);
    
    }
}
