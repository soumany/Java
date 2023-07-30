
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Account{
    private int account_no;
    private String name;
    private double balance;
    private String password;

    Account(int account_no, String name, double balance, String password) { 
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
    File file = new File("C:\\Github Repo\\APL\\APL-S2\\Assignment4\\Account.txt");
    public void withdraw(double amount) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            if (balance >= amount) {
                balance -= amount;
                System.out.println("----------------------------------------------------");
                System.out.println("withdraw successful.\n");
                writer.write("\n------------------After Withdraw---------------------\n");
                writer.write("New balance = " + (balance));
            } else {
                System.out.println("Insufficient funds.");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Invalid input. Please try again.\n");
        }
        
    }

    public void deposit(double amount) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            balance += amount;
            System.out.println("----------------------------------------------------");
            System.out.println("deposit successful.\n");
            writer.write("\n------------------After Deposit---------------------\n");
            writer.write("New balance = " + balance);
            writer.close();
        } catch (IOException e) {
            System.out.println("Invalid input. Please try again.\n");

        }
        
        
    }

    public void transfer(Account recipient, double amount) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            if (balance >= amount) {
                balance -= amount;
                recipient.balance += amount;
                System.out.println("----------------------------------------------------");
                System.out.println("transfer successful.\n");
                writer.write("\n------------------After Transfer---------------------\n");
                writer.write("New balance = " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
        
    }
    
}

public class Ch4_Ex7 {
    public static Map<Integer, Account> accounts = new HashMap<>();
    private static boolean login(int account_no, String password) {
        Account account = accounts.get(account_no);

        if (account == null || !account.verifyPassword(password)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Account account1 = new Account(001, "Many", 5000.00, "Many01");
        Account account2 = new Account(002, "Sopheak", 2500.00, "Pheak02");
        Account account3 = new Account(003, "Koemnak", 1000.00, "Koemnak03");
        Account account4 = new Account(004, "Khive", 750.00, "Khive04");
        
        accounts.put(account1.getAccountNo(), account1);
        accounts.put(account2.getAccountNo(), account2);
        accounts.put(account3.getAccountNo(), account2);
        accounts.put(account4.getAccountNo(), account2);

        Scanner scanner = new Scanner(System.in);

        int account_no;
        String password;

        do {
            System.out.print("-----------------<< Login Account>>--------------------\n");
            System.out.print("Enter account number: ");
            account_no = scanner.nextInt();
            System.out.print("Enter password: ");
            password = scanner.next();

            if(
                login(account_no, password)
            ){
                System.out.println("----------------------------------------------------");
                System.out.println("correct!. you're login successful.\n");
            }
            else{
                System.out.println("Login failed. Please try again.\n");
            }
            
        } while (!login(account_no, password));

        Account account = accounts.get(account_no);//get key

        char option;

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("a. Balance");
            System.out.println("b. Withdraw");
            System.out.println("c. Deposit");
            System.out.println("d. Transfer");
            System.out.println("e. Exit");
            System.out.print("Enter option:");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'a':
                String line;
                    File file = new File("C:\\Github Repo\\APL\\APL-S2\\Assignment4\\Account.txt");
                    try{
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                        writer.write("------------------<<Current Balance>>---------------------\n");
                        writer.write("User Account : "+account.getName()+"\t|   Balance = " + account.getBalance());
                        writer.close();
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    }
                    catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case 'b':
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    break;
                    
                case 'c':
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        
                    break;
                case 'd':

                int recipientAccountNo;
                double transferAmount;
                do{
                    do{
                        System.out.print("Enter recipient account number: ");
                        recipientAccountNo = scanner.nextInt();
                        if(recipientAccountNo == account.getAccountNo()){
                            System.out.println("You can't transfer to your own account. Please enter another account!.");
                        }else{
                            System.out.println("Account number not found. Please try again.");
                        }
                        
                    }while(recipientAccountNo == account.getAccountNo());
                        System.out.print("Enter recipient account number: ");
                        recipientAccountNo = scanner.nextInt();
                        Account recipient = accounts.get(recipientAccountNo);
                        System.out.print("Enter amount to transfer: ");
                        transferAmount = scanner.nextDouble();
                        account.transfer(recipient, transferAmount);
                }while(account.getBalance() < 0);
                break;
                    
                case 'e':
                    System.out.println("Thank you for using our simple ATM account");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    
    }
    
    
