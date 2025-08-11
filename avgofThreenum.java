import java.util.Scanner;

public class avgofThreenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st no : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 1st no : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter 1st no  : ");
        int num3 = scanner.nextInt();

        int num4 = (num1 + num2 + num3) / 3;

        System.out.println("Average is " + num4);

    }
}
