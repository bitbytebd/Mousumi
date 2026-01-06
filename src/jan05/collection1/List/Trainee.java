/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan05.collection1.List;

/**
 *
 * @author Mousumi Akter
 */
public class Trainee {
    private int id;
    private String name;
    private String post;
    private double salary;

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Trainee(int id, String name, String post, double salary) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Trainee{" + "id=" + id + ", name=" + name + ", post=" + post + ", salary=" + salary + '}';
    }
    
    
}
