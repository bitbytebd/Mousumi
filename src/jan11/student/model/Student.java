/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.student.model;

/**
 *
 * @author Mousumi Akter
 */
public class Student {
    private int id;
    private String name;
    private int marks;
    private double fees;

        public Student() {
            
         }
    
    public Student(int id, String name, int marks, double fees) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id +
                ", name=" + name + 
                ", marks=" + marks +
                ", fees=" + fees + '}';
    }


    
}
