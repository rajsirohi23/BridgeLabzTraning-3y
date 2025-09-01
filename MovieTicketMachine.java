// 2. The Movie Ticket Machine 🎬

// At a cinema hall, customers buy different categories of tickets (Silver, Gold, Platinum).
// Use a switch to assign prices to each category.
// Multiply by the number of tickets purchased.
// Add a service charge (5%) using arithmetic operators.
// Use a while loop to handle multiple customers until "exit" is entered.


import java.util.Scanner;

public class MovieTicketMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter ticket type (Silver / Gold / Platinum) or 'exit' to quit: ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            int price = 0;
            switch (type.toLowerCase()) {
                case "silver": 
                price = 150; 
                break;
                case "gold": 
                price = 250; 
                break;
                case "platinum": 
                price = 400; 
                break;
                default:
                    System.out.println("Invalid type!");
                    continue;
            }

            System.out.print("How many tickets? ");
            int qty = sc.nextInt();
            sc.nextLine(); 
            double total = price * qty;
            double finalAmount = total + (total * 0.05);

            System.out.println("Final Amount: " + finalAmount);
        }

        sc.close();
    }
}
