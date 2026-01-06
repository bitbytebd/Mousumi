/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.model;

/**
 *
 * @author Tultuli
 */
public class EmployeeModel {
    private int id;
    private String fName;   
    private String lName;
    private String desig;
    private String dept;
    private double salary;
    private int age;   
    private String addr;

    public EmployeeModel(int id, String fName, String lName, String desig, String dept, double salary, int age, String addr) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.desig = desig;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
    


        

}
