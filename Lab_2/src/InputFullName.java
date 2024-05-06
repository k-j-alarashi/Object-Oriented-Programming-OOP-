
import java.util.Scanner;

/**
 * to Enter your full name after you input id you need to use nextLine( ) method
 * and also you need to add another nextLine ( ) because when you click on Enter
 * this click will take the first line after input the id , so you need to add another nextLine()
 * before input the full name .
 * 
 * try to comment line 19 and run the program to understand the idea.
 * 
 */
public class InputFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID : ");
        int id = input.nextInt();
        System.out.print("Enter your full Name : ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("\nID : "+id+"\nName : "+name);
    }
}
