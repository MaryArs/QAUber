package inheritance;

public class BankAccount {
    protected String nameOfParentBankAccount;
    protected int numberAccount;
    protected int balance;

    public BankAccount(String nameOfParentBankAccount, int numberAccount, int balance){
        this.nameOfParentBankAccount = nameOfParentBankAccount;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public int checkBalance() {
        return balance;
    }
}
