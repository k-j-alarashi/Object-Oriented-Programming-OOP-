
import java.util.Scanner;

/**
 *      Question 3 :
 *   	Write a java program that read two integer numbers , 
 *      and make all Arithmetic operations ( summation , subtraction , multiplication , division  )
 *      for them ? print the output  .
 */
public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        System.out.println("======================");
        System.out.println("summation = "+(num1+num2));
        System.out.println("summation = "+(num1-num2));
        System.out.println("multiplication = "+(num1*num2));
        System.out.println("division = "+(num1/num2));
    }
}
