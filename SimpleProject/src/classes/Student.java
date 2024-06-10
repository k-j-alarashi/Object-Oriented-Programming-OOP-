/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author khale
 */
public class Student extends Person{
    private String major ;

    public Student(String major, String name, int age) {
        super(name, age);
        this.major = major;
    }

    
    public Student(String name, int id, String major, int age) {
        super(id, name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
}
