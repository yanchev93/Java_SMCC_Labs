import java.util.Scanner;


public class Program {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputDate;
        while (true) {
            inputDate = scnr.nextLine();

            if (inputDate.equals("-1")) {
                break;
            }


            if (inputDate.contains(",")) {
                // split the array into 2
                String[] dateParts = inputDate.split(", ");

                // split the first part of the array into month and day
                String[] monthAndDay = dateParts[0].split(" ");

                String month = monthAndDay[0];
                int day = Integer.parseInt(monthAndDay[1]);
                int year = Integer.parseInt(dateParts[1]);

                int monthInt = getMonthAsInt(month);

                if (monthInt != 0) {
                    System.out.printf("%d-%d-%d\n", monthInt, day, year);
                }
            }
        }
    }
}
