
package lab_7;

public class Employee extends Person{

    private double salary ;

    public Employee(double salary, int id, String name, int age) {
        super(id, name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString()+
                "\nSalary : "+getSalary();
    }
}

