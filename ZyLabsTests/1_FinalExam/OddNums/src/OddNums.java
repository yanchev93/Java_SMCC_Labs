public class OddNums {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 101) {
            sum += number;
            number += 2;
        }

        System.out.println("Sum of odd integers between 1 and 101 inclusive: " + sum);
    }
}
