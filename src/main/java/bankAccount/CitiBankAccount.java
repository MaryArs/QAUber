package bankAccount;

public class CitiBankAccount implements BankAccount {
    private int accountNumber;
    private String consumerName;
    private double balance;
    private boolean isActive;

    public CitiBankAccount(int accountNumber, String consumerName, double balance, boolean isActive){
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
    }

    public double checkBalance(){
        return balance;
    }
}
