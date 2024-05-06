
import java.util.Scanner;
/**
 *     Question 4 :
 *   Write java program that read three integers numbers
 *    and calculate the average of them ? print the output.
 */
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter third number : ");
        int num3 = input.nextInt();
        float avg = (num1+num2+num3)/3;
        System.out.println("======================");
        System.out.println("The Average is  = "+avg+" %");
    }
}
