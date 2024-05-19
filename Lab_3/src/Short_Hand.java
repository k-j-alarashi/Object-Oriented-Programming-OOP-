
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khaled Jalal
 */
public class Short_Hand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter The Third Number : ");
        int num3 = input.nextInt();
        System.out.println("\n================================");
        // using Short Hand if-else condition .
        int result = ((num1>num2)?num1:num2) > num3 ? ((num1>num2)?num1:num2): num3 ;
        System.out.println(result);
    }
}
