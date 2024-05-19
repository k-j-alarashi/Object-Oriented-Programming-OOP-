/*
Question :
    ❖ Write a java program that reads two numbers from user and print the largest
      one , or print " equal " if they equal each other ?
*/
import java.util.Scanner;

public class Nested_Branches {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter First Number  : ");
        int x = k.nextInt();
        System.out.println("Enter Second Number : ");
        int y = k.nextInt();
        //using nested branches (nested-if)
        if( x<y )
        {
            System.out.println(y);
        }
        else
        {
            if( x>y )
            {
                System.out.println(x);
            }
            else
            {
                System.out.println("equal");
            }
        }
    }
}
