package bank;

public class BankAccount {
    private int accountNumber;
    private String consumerName;
    private double balance;
    private boolean isActive;

    public BankAccount(int accountNumber, String consumerName, double balance, boolean isActive){
        this.accountNumber = accountNumber;
        this.consumerName = consumerName;
        this.balance = balance;
        this.isActive = isActive;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount)throws MinimumBalanceException{

        if ((balance -amount) < 500){
            MinimumBalanceException minbalexception = new MinimumBalanceException();
            throw minbalexception;
        } else {
            balance = balance - amount;
            System.out.println("You have withdrawn " + amount + "$." + " and your new balance is " + balance +"$.");
        }

    }

    public double checkBalance(){
        return balance;
    }
}
