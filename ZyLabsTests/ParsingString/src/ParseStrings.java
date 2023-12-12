import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.println("Enter input string:");
            userInput = scnr.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                break;
            }

            if (userInput.contains(",")) {
                String[] parts = userInput.split(",");

                String firstWord = parts[0].trim();
                String secondWord = parts[1].trim();

                System.out.println("First word: " + firstWord);
                System.out.println("Second word: " + secondWord);
                System.out.println();
            } else {
                System.out.println("Error: No comma in string.");
                System.out.println();
            }
        }


    }
}