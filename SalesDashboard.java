// 4. Sales Dashboard 📊
// A shop records daily sales for 10 days in an array.
// Calculate the total sales using a loop.
// Find the day with maximum sales.
// Check if the shop ever had a day with zero sales (holiday).



import java.util.Scanner;

public class SalesDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sales = new int[10];
        int total = 0;
        int maxSales = 0;
        int maxDay = 0;
        int minsale = Integer.MAX_VALUE;
        int minday =0;
        boolean holiday = false;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter sales for Day " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
            total += sales[i];

            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxDay = i + 1;
            }
            if (sales[i] == 0) {
                holiday = true;
            }
            if (sales[i] < minsale) {
                minsale = sales[i];
                minday = i + 1;

            }
        }

        System.out.println("\nTotal Sales: " + total);
        System.out.println("Maximum Sales: " + maxSales + " (Day " + maxDay + ")");
        System.out.println("Minimum Sales: " + minsale  + " (Day " + minday + ")");
        if (holiday) {
            System.out.println("Yes, the shop had a holiday (zero sales).");
        } else {
            System.out.println("No, the shop had sales every day.");
        }

        sc.close();
    }
}
