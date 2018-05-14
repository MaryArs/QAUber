package bank;

public class BankAccount {
    private int accountNumber;
    private String consumerName;
    private double balance;
    boolean isActive;

    public BankAccount(int accountNumber, String consumerName, double balance, boolean isActive){
        this.accountNumber = accountNumber;
        this.consumerName = consumerName;
        this.balance = balance;
        this.isActive = isActive;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
        if (balance < 500){
            System.out.println("You can't withdraw this amount!");
        } else {
            System.out.println("You have withdrawn " + amount + "$." + " and your new balance is " + balance +"$.");
        }

    }

    public double checkBalance(){
        return balance;
    }
}
