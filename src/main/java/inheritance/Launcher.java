package inheritance;

public class Launcher {
    public static void main(String[] args) {

        CitiBankAccount citiAccount = new CitiBankAccount("Mary", 12345, 1000);
        citiAccount.withdraw(1000);
        int x = citiAccount.checkBalance();
        System.out.println(x);

        ChaseBankAccount chaseAccount = new ChaseBankAccount("Anny", 34567, 1500);
        chaseAccount.withdraw(1500);
        int y = chaseAccount.checkBalance();
        System.out.println(y);

        BankAccount bankAccount = new BankAccount("Larry", 12, 500);
        bankAccount.withdraw(100);
        int z = bankAccount.checkBalance();
        System.out.println(z);
    }
}
