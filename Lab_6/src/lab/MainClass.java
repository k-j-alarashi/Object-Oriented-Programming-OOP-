package lab;

public class MainClass {

    public static void main(String[] args) {
        
        // remove the comment to run and test classes .
        
        // test of the Student class :
//        Student s = new Student(1000, "Khaled");
//        s.setAge(22);
//        s.setMajor("CS");
//        System.out.println("ID : " + s.getId());
//        System.out.println("NAME : " + s.getName());
//        System.out.println("AGE : " + s.getAge());
//        System.out.println("MAJOR : " + s.getMajor());
        
        System.out.println("================================");
        
        //test of the BankAccount class :
        BankAccount account = new BankAccount(0);
        System.out.println("The Money in the account = " + account.getBalance());
        account.deposit(10000);
        System.out.println("The Money in the account after deposit = " + account.getBalance());
        account.withDraw(4000);
        System.out.println("The Money in the account = " + account.getBalance());

    }
}
