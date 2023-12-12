import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.println("Enter an integer between 100 and 500 inclusive: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }

            userNumber = scanner.nextInt();

            if (userNumber < 100 || userNumber > 500) {
                System.out.println("Invalid input. Please enter a number between 100 and 500.");
            }

        } while (userNumber < 100 || userNumber > 500);

        System.out.println("You entered a valid number: " + userNumber);

    }
}
