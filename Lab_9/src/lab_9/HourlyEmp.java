/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_9;

public class HourlyEmp extends Employee{
    private int numOfHours ;
    public HourlyEmp(int numOfHours, String name, int age, double hourRate) {
        super( name, age, hourRate);
        this.numOfHours = numOfHours;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    @Override
    public double getSal() {
        return numOfHours * super.getSal();
    }
    
    @Override
    public String toString() {
        return super.toString() +"numOfHours=" + numOfHours+"Total : "+getSal();
    }
    
}
