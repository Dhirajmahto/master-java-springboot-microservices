package OOps.classesdemo.abstraction;

public class kidsAccount extends BankAccount{
    public kidsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited "+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing "+amount);
    }
}
