/*
Question :
        ❖ Write a java program that reads three numbers from the user and print the
           largest one ? 
*/
import java.util.Scanner;


public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter The Third Number : ");
        int num3 = input.nextInt();
        System.out.println("\n================================");
        // using if-else condition .
        if(num1>=num2 && num1>=num3)
        {
            System.out.println("First Number is the Largest : "+num1);
        }
        else if(num2>=num1 && num2>=num3)
        {
            System.out.println("Second Number is the Largest : "+num2);
        }
        else
        {
            System.out.println("Third Number is the Largest : "+num3);
        }
    }
  
}
