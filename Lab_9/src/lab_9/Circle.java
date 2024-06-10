/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_9;

/**
 *
 * @author lab
 */
public class Circle implements Shape_{
    private double r ;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double calcArea() {
        return 3.14 * r * r ;
    }

    @Override
    public void display() {
        System.out.println("Circle");
    }
    
}
