
public class Account {
    private int account_no;
    private String name;
    private double balance;
    private String password;

    public Account(int account_no, String name, double balance, String password) { //constructor
        this.account_no = account_no; 
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public int getAccountNo() {
        return account_no;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void transfer(Account recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

