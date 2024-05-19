/*
Question :
    ❖ Write a java program that reads number of the day within a week and print
       the name of that day ? (using Switch).
*/

import java.util.Scanner;

public class Switch_Case {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of the day : ");
        int numOfDay = x.nextInt();
        System.out.println("===============================");
        //using switch.
        switch (numOfDay) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Enter The Correct Number .");
        }
    }
}
