/*
    Question 1 :
     Write java program and declare int variable for id , 
    String variable for name double variable for salary , 
    and print them in printf ( ) method ?
*/

public class FormattedString {
    public static void main(String[] args) {
        /*
        in printf() to print variables use the following :
        %d ----> int variables.
        %f ----> float , double variables.
        %s or %S -----> String variables.
        %c or %C -----> char variables.
        %n or \n -----> new line. ( %n used for new line in prinf () )
        */
        int id = 100 ;
        String name = "Khaled";
        double salary = 1000.0;
        System.out.printf("ID : %d Name : %s Salary : %f \n",id,name,salary);
    }
}
