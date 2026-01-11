/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan11.collection;

/**
 *
 * @author Tultuli
 */

class PersonSalary{
    private double minSalary;
    private double maxSalary;
    private String incrementType;

    public PersonSalary(double minSalary, double maxSalary, String incrementType) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.incrementType = incrementType;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getIncrementType() {
        return incrementType;
    }

    public void setIncrementType(String incrementType) {
        this.incrementType = incrementType;
    }

    @Override
    public String toString() {
        return "PersonSalary{" + "minSalary=" + minSalary + ", maxSalary=" + maxSalary + ", incrementType=" + incrementType + '}';
    }
    
    
}

class PersonAddress{
    private String area;
    private int road;
    private String locality;

    public PersonAddress(String area, int road, String locality) {
        this.area = area;
        this.road = road;
        this.locality = locality;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return "PersonAddress{" + "area=" + area + ", road=" + road + ", locality=" + locality + '}';
    }
    
    
}


public class Person {
    private int id;
    private String name;
    private PersonSalary salary;
    private PersonAddress address;

    public Person(int id, String name, PersonSalary salary, PersonAddress address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    Person() {
     
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

    public PersonSalary getSalary() {
        return salary;
    }

    public void setSalary(PersonSalary salary) {
        this.salary = salary;
    }

    public PersonAddress getAddress() {
        return address;
    }

    public void setAddress(PersonAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + '}';
    }
    
    
    
}


