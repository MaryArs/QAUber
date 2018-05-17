package bank;

public class Test {

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(123456, "Marina", 1000, true);
        myAccount.withdraw(300);
      double x =  myAccount.checkBalance();
      System.out.println("Your new balance is" + x + "$.");
        myAccount.withdraw(700);
        double y = myAccount.checkBalance();
        System.out.println("Your new balance" + x + "$.");

    }
}
