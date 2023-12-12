public class OddNumsForLoop {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 199; number += 2) {
            sum += number;
        }

        System.out.println("Sum of odd integers from 1 to 199: " + sum); // It should be 10 000 if not mistaken

        System.out.println();
        System.out.println("New CODE");

        int x = -2;
        int y = 4;
        int z = 0;

        if (x > y){
            z = z + 1;
        }
        else if (x < y){
            z = z - 1;
            x = x + 1;
            System.out.println( x );
        }
        else{
            y = y + 1; }
        z = 10;
        System.out.println( z );
        System.out.println( "x = " + x + " y = " + y + " z = " + z );
    }
}
