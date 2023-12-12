import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DataVisualizer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a title for the data:");
        String title = scnr.nextLine();
        System.out.println("You entered: " + title);
        System.out.println();

        System.out.println("Enter the column 1 header:");
        String column1Header = scnr.nextLine();
        System.out.println("You entered: " + column1Header);
        System.out.println();

        System.out.println("Enter the column 2 header:");
        String column2Header = scnr.nextLine();
        System.out.println("You entered: " + column2Header);
        System.out.println();

        ArrayList<String> dataStrings = new ArrayList<>();
        ArrayList<Integer> dataIntegers = new ArrayList<>();

        String dataPoint = scnr.nextLine();
        while (!dataPoint.equals("-1")) {
            System.out.println("Enter a data point (-1 to stop input):");

            if (!dataPoint.contains(",")) {
                System.out.println("Error: No comma in string.");
                System.out.println();

                dataPoint = scnr.nextLine();
                continue;
            }

            String[] commaLength = dataPoint.split(",");
            if (commaLength.length != 2) {
                System.out.println("Error: Too many commas in input.");
                System.out.println();

                dataPoint = scnr.nextLine();
                continue;
            }

            String[] dataParts = dataPoint.split(",");
            String dataString = dataParts[0];
            String isInteger = dataParts[1];

            for (int i = 0; i < isInteger.length(); i++) {
                if (Character.isDigit(isInteger.charAt(i))) {
                    int dataInteger = Integer.parseInt(isInteger);


                    System.out.println("Data string: " + dataString);
                    System.out.println("Data integer: " + dataInteger);
                    System.out.println();

                    dataStrings.add(dataString);
                    dataIntegers.add(dataInteger);
                } else {
                    System.out.println("Error: Comma not followed by an integer.");
                    System.out.println();
                }

                break;
            }

            dataPoint = scnr.nextLine();
        }
        System.out.println("Enter a data point (-1 to stop input):");
        System.out.println();


        System.out.printf("%33s%n", title);
        System.out.printf("%-19s | %22s%n", column1Header, column2Header);
        System.out.println("--------------------------------------------");


        for (int i = 0; i < dataStrings.size(); i++) {
            System.out.printf("%-19s | %22d%n", dataStrings.get(i), dataIntegers.get(i));
        }

        System.out.println();
        for (int i = 0; i < dataStrings.size(); i++) {
            String name = dataStrings.get(i);
            int asteriskCount = dataIntegers.get(i);

            System.out.printf("%20s ", name);

            for (int j = 0; j < asteriskCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
