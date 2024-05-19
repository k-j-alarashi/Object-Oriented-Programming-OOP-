
/*
Question:
      ❖ Write a java program that reads the earth shake
        degree as int number , and print the effect of the damage ?
*/
import java.util.Scanner;


public class Richter_Scale {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the Earthshake degree : ");
     float richter = in.nextFloat();
     System.out.println("==============================");
     if( richter >= 8.0){
         System.out.println("مدمر");
     }
     else if( richter >= 7.0){
         System.out.println("قوي");
     }
     else if( richter >= 6.0){
         System.out.println("متوسط");
     }
     else if( richter >= 4.0){
         System.out.println("ضعيف");
     }
     else{
         System.out.println("ضعيف جدا");
     }
        
    }
}
