
package lab_7;

public class Lab_7 {

    public static void main(String[] args) {
        Student[] s = new Student[2];
        s[0] = new Student("CS", 2023, "Khaled", 22);
        s[1] = new Student("IT", 2022, "Ahmed", 23);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            System.out.println("=====");
        }
    }
    
    //create objects for employees from Employee Class ?
    
}
