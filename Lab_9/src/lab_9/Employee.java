/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_9;


public class Employee {
    private  int id ;
    private String name ;
    private int age ;
    private double sal ;
    private static int count = 1 ;

    public Employee(String name, int age) {
        this.id = count;
        this.name = name;
        this.age = age;
        count++;
    }
    
    
    
    public Employee( String name, int age, double sal) {
        this.id = count;
        this.name = name;
        this.age = age;
        this.sal = sal;
        count++;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public  void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal+" " ;
    }
}
