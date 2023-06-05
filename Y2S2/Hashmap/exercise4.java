import java.util.HashMap;
import java.util.Scanner;

public class exercise4 {
    private static final HashMap<String, String[]> ACCOUNTS = new HashMap<>(); // stores account information

    public static void main(String[] args) {
        // initialize account data
        ACCOUNTS.put("001", new String[]{"Alice", "1000.00", "1234"});
        ACCOUNTS.put("002", new String[]{"Bob", "500.00", "5678"});
        ACCOUNTS.put("003", new String[]{"Charlie", "1500.00", "9012"});
        ACCOUNTS.put("004", new String[]{"David", "200.00", "3456"});
        ACCOUNTS.put("005", new String[]{"Eve", "3000.00", "7890"});

        Scanner scanner = new Scanner(System.in);
        String accountNo, password;
        do {
            System.out.print("Enter account number: ");
            accountNo = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!login(accountNo, password));

        System.out.println("\nWelcome, " + ACCOUNTS.get(accountNo)[0] + "!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("a. Balance");
            System.out.println("b. Withdraw");
            System.out.println("c. Deposit");
            System.out.println("d. Transfer");
            System.out.println("e. Exit");

            String option = scanner.nextLine().toLowerCase();
            switch (option) {
                case "a":
                    System.out.printf("Your balance is $%.2f\n", Double.parseDouble(ACCOUNTS.get(accountNo)[1]));
                    break;
                case "b":
                    double amount;
                    do {
                        System.out.print("Enter amount to withdraw: $");
                        amount = Double.parseDouble(scanner.nextLine());
                        if (amount > Double.parseDouble(ACCOUNTS.get(accountNo)[1])) {
                            System.out.print("Insufficient balance. Try again? (y/n) ");
                            String choice = scanner.nextLine().toLowerCase();
                            if (!choice.equals("y")) {
                                break;
                            }
                        }
                    } while (amount > Double.parseDouble(ACCOUNTS.get(accountNo)[1]));
                    if (amount <= Double.parseDouble(ACCOUNTS.get(accountNo)[1])) {
                        double newBalance = Double.parseDouble(ACCOUNTS.get(accountNo)[1]) - amount;
                        ACCOUNTS.get(accountNo)[1] = String.format("%.2f", newBalance);
                        System.out.printf("$%.2f withdrawn successfully. Your new balance is $%.2f\n", amount, newBalance);
                    }
                    break;
                case "c":
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    double updatedBalance = Double.parseDouble(ACCOUNTS.get(accountNo)[1]) + depositAmount;
                    ACCOUNTS.get(accountNo)[1] = String.format("%.2f", updatedBalance);
                    System.out.printf("$%.2f deposited successfully. Your new balance is $%.2f\n", depositAmount, updatedBalance);
                    break;
                case "d":
                    System.out.print("Enter recipient's account number: ");
                    String recipientAccountNo = scanner.nextLine();
                    if (!ACCOUNTS.containsKey(recipientAccountNo)) {
                        System.out.println("Recipient account not found.");
                        break;
                    }
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = Double.parseDouble(scanner.nextLine());
                    if (transferAmount > Double.parseDouble(ACCOUNTS.get(accountNo)[1])) {
                        System.out.println("Insufficient balance.");
                        break;
                    }
                    System.out.print("Enter your password to confirm: ");
                    String confirmPassword = scanner.nextLine();
                    if (!confirmPassword.equals(ACCOUNTS.get(accountNo)[2])) {
                        System.out.println("Incorrect password.");
                        break;
                    }
                    double senderNewBalance = Double.parseDouble(ACCOUNTS.get(accountNo)[1]) - transferAmount;
                    ACCOUNTS.get(accountNo)[1] = String.format("%.2f", senderNewBalance);
                    double recipientNewBalance = Double.parseDouble(ACCOUNTS.get(recipientAccountNo)[1]) + transferAmount;
                    ACCOUNTS.get(recipientAccountNo)[1] = String.format("%.2f", recipientNewBalance);
                    System.out.printf("$%.2f transferred successfully to account %s. Your new balance is $%.2f\n", transferAmount, recipientAccountNo, senderNewBalance);
                    break;
                case "e":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        System.out.println("Goodbye!");
    }
    private static boolean login(String accountNo, String password) {
        // Check if the provided account number exists in the ACCOUNTS HashMap
        if (ACCOUNTS.containsKey(accountNo)) {
            String[] accountData = ACCOUNTS.get(accountNo);
            // If the password matches the one associated with the account, return true
            if (accountData[2].equals(password)) {
                return true;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        } else {
            System.out.println("Invalid account number. Try again.");
        }
        return false; // Authentication failed
    }}
    

    