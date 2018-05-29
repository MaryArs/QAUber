package inheritance;

public class ChaseBankAccount extends BankAccount {

    public ChaseBankAccount(String nameOfParentBankAccount, int numberAccount, int balance){
        super(nameOfParentBankAccount, numberAccount, balance);
    }

    public void  withdraw(int amount){
        if ((balance -amount) < 500){
            System.out.println("You can't withdraw this amount!");
        } else {
            balance = balance - amount;
            System.out.println("You have withdrawn " + amount + "$." + " and your new balance is " + balance +"$.");
        }
    }
}
