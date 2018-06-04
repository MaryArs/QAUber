package bank;

public class Test {

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(123456, "Marina", 1000, true);
        try {
            myAccount.withdraw(300);
        } catch (MinimumBalanceException ex){
            System.out.println("You can't withdraw this amount!");;
        }
      double x =  myAccount.checkBalance();
      System.out.println("Your new balance is " + x + "$.");
      try {
          myAccount.withdraw(700);
      } catch (MinimumBalanceException ex){
          System.out.println("You can't withdraw this amount!");
      }
        double y = myAccount.checkBalance();
        System.out.println("Your new balance " + x + "$.");

    }
}
