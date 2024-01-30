package Day7.challangeBank;

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction("Deposited: " + amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            addTransaction("Withdrew: " + amount);
            return true;
        } else {
            addTransaction("Failed Withdrawal: " + amount);
            return false;
        }
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction("Deposited: " + amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            addTransaction("Withdrew: " + amount);
            return true;
        } else {
            addTransaction("Failed Withdrawal: " + amount);
            return false;
        }
    }
}
