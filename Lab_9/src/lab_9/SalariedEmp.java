/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_9;

/**
 *
 * @author lab
 */
public class SalariedEmp extends Employee{
    private double bouns ;
    private double dedction ;

    public SalariedEmp(double bouns, double dedction, String name, int age, double sal) {
        super(name, age, sal);
        this.bouns = bouns;
        this.dedction = dedction;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDedction() {
        return dedction;
    }

    public void setDedction(double dedction) {
        this.dedction = dedction;
    }

    @Override
    public double getSal() {
        return super.getSal() + bouns - dedction ;
    }

    @Override
    public String toString() {
        return super.toString()+"bouns=" + bouns + ", dedction=" + dedction + "Total salay : "+getSal();
    }
    
    
    
}
