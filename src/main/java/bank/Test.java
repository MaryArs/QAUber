package bank;

public class Test {

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(123456, "Marina", 1000, true);
        myAccount.withdraw(300);
        myAccount.withdraw(700);

    }
}
