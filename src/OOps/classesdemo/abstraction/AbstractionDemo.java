package OOps.classesdemo.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("jhdsgfjfuj",100);
        savingsAccount.deposit(100);

        BankAccount savingsAccount2 = new SavingsAccount("sjdfhsahj",500);
        savingsAccount2 = new CurrentAccount("asiduhaiu",700);
        savingsAccount2.deposit(1000);
    }
}
