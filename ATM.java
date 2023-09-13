package bankatm;


public class ATM {
    private BANKACCOUNT userAccount;

    public ATM(BANKACCOUNT userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for withdrawal.");
        } else if (userAccount.getBalance() < amount) {
            System.out.println("Insufficient balance.");
        } else {
            userAccount.withdraw(amount);
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for deposit.");
        } else {
            userAccount.deposit(amount);
            System.out.println("Deposited: $" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: $" + userAccount.getBalance());
    }
}

