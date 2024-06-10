package lab;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withDraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("You Withdraw Successfully , the withdraw amont = " + amount);
        } else {
            System.out.println("Sorry , There are no enough money to withdraw ... ! ");
        }
    }
    
    public double getBalance()
    {
        return balance ;
    }
}
