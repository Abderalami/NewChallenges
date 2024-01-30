package Day7.challangeBank;
public class BankSystem {
    public static void main(String[] args) {
        Trans transactionManager = new Trans();

        BankAccount savings = new SavingsAccount("12345");
        BankAccount checking = new CheckingAccount("67890");

        transactionManager.addAccount(savings);
        transactionManager.addAccount(checking);

        savings.deposit(1000);
        savings.withdraw(500);

        checking.deposit(2000);
        checking.withdraw(2500); // This should fail

        transactionManager.printTransactionHistory("12345");
        transactionManager.printTransactionHistory("67890");
    }
}

