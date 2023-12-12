package src;

public class Teaser_2 {
        public static void main(String[] args ){
            int a, b, c;
            a = 6;
            b = 5;
            c = 4;
            if ((a > b) && (b > c)){
                System.out.println( "First answer is YES" );
            } else {
                System.out.println( "First answer is NO" );
            }
            if ((a > b) || (b > c)) {
                System.out.println( "Second answer is YES" );
            } else {
                System.out.println( "Second answer is NO" );
            }
            if (a < b + c) {
                if (b > c + a) {
                    System.out.println( "Third answer is ONE" );
                } else {
                    System.out.println( "Third answer is TWO" );
                }
            }
        }// main

}
