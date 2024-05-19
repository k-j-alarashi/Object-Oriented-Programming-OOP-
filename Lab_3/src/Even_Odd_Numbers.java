/*
Question :
        ❖ Write a java program that reads int number from user and check if this number
           is even or odd ?
*/
import java.util.Scanner;


public class Even_Odd_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println("=====================");
        //use if
        if ( num%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
