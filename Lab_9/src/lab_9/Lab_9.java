package lab_9;

import java.util.ArrayList;

public class Lab_9 {

    public static void main(String[] args) {
        Employee e = new Employee("Khaled", 23, 10000);
        SalariedEmp se = new SalariedEmp(300, 50,  "Ahmed", 22, 30000);
        HourlyEmp he = new HourlyEmp(10,  "mohammed", 33, 200);
        se.getBouns();
        ArrayList<Employee> a = new ArrayList<>();
        a.add(e);
        a.add(se);
        a.add(he);
        for (Employee t : a) {
                System.out.println(t);
        }
        
    }

}
