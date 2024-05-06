/**
 *      Question 5 :
 *   	Declare two String variables and assign values you want, after  that  use equal ( ) method
 *      to check if they equal each other , and use the following methods 
 *      for first variable you declared :
              •	charAt ( int index )
              •	toUpperCase ( ) 
              •	toLowerCase ( ) 

 */
public class StringOperation {
    public static void main(String[] args) {
       String x = "aaa";
       String y = "aab";
        System.out.println("======================");
        System.out.println("equals : "+x.equals(y));
        System.out.println("charAt : "+y.charAt(2));
        System.out.println("toUpperCase : "+x.toUpperCase());
        System.out.println("toLowerCase : "+y.toLowerCase());
        System.out.println("======================");
    }
}
