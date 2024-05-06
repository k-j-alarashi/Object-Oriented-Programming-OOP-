
import java.util.Scanner;


/**
 *      Question 2 :
 *   	From the previous question in ( FormattedString ) class, 
 *      make user who input values for id , name , and salary
 *      by using Scanner class ?
 * 
 */
public class InputFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID : ");
        int id = input.nextInt() ;
        System.out.print("Enter the Name : ");
        String name = input.next();
        System.out.print("Enter the Salary : ");
        double salary = input.nextDouble();
        System.out.println("============================================");
        System.out.printf(" ID : %d %n Name : %s %n Salary : %.2f \n",id,name,salary);
    }
}
