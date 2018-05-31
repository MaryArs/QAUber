package bankAccount;

import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {

        BankAccount hsbcAccount = new HSBCBankAccount(1, "Larry", 1000.20, true);
        BankAccount citiAccount = new CitiBankAccount(2, "Andrew", 500.35, true);
        ArrayList<BankAccount> sumBalance= new ArrayList<>();
        sumBalance.add(hsbcAccount);
        sumBalance.add(citiAccount);
        double sum =0;
        for(BankAccount sumbal: sumBalance){
            double x = sumbal.checkBalance();
            sum += x;
        }
        System.out.println(sum);
    }
}
