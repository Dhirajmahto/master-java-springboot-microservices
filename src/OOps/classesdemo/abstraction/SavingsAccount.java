package OOps.classesdemo.abstraction;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited $" + amount);

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn $" + amount);

    }
}
