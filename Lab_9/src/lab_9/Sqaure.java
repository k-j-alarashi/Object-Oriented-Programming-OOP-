/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_9;

/**
 *
 * @author lab
 */
public class Sqaure extends Shape{
    private static double side ;

    public Sqaure(double side) {
        this.side = side;
    }

    public static double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return 4 * side ;
    }

    @Override
    public void display() {
        System.out.println("Squre");
    }
    
}
