package bank;
/**
*This is a class which used to create a Bank Account Objects.
* @author Marina Arsitova
* */
public class BankAccount {

    /**
    * accountNumber is an integer variable for storing  unique Account number;
    * consumerName is a String variable for storing holder's name;
    * balance is storing current balance of this account;
    * isActive is storing a boolean status of account (is it active right now or not).
    * */

    private int accountNumber;
    private String consumerName;
    private double balance;
    private boolean isActive;

    /**
    * This ia a constructor which creates Bank Account Object.
    * @param accountNumber account number
    * @param consumerName account holder name
    * @param balance current balance of account
    * @param isActive status of account
    * */
    public BankAccount(int accountNumber, String consumerName, double balance, boolean isActive){
        this.accountNumber = accountNumber;
        this.consumerName = consumerName;
        this.balance = balance;
        this.isActive = isActive;
    }

    /**
    *This method is used to deposit money from account.
    * */
    public void deposit(double amount){
        balance = balance + amount;
    }

    /**
    * This method is used to withdraw money from account. In account should be minimum of 500$.
    * @param amount How much do you want to withdraw.
    * @throws MinimumBalanceException this will thrown if you are not keeping minimum of 500$ in account.
    * */
    public void withdraw(double amount)throws MinimumBalanceException{

        if ((balance -amount) < 500){
            MinimumBalanceException minbalexception = new MinimumBalanceException();
            throw minbalexception;
        } else {
            balance = balance - amount;
            System.out.println("You have withdrawn " + amount + "$." + " and your new balance is " + balance +"$.");
        }

    }

    /**
     *This method is used to check balance in the account.
     * */
    public double checkBalance(){
        return balance;
    }
}
