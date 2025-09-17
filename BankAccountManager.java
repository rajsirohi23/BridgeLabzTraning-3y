import java.util.Scanner;

public class BankAccountManager {
    static class BankAccount {
        private String accountNumber;
        private double balance;


        public BankAccount(String accountNumber, double Balance) {
            this.accountNumber = accountNumber;
            this.balance = Balance;
        }


        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }

        public void checkBalance() {
            System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double Balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, Balance);


        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 4);

        sc.close();
    }
}
