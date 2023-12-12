public class TraceMagic{
    public static void show (int nums[], int howMany){
        int j;
        for (j = 0; j < howMany; j++)
            System.out.printf( "%4d", nums[j]);

        System.out.println();
    }// show

    public static void magic (int value[], int newGuy, int where){
        int k = where - 1;
        boolean found = false;

        while ((k > 0) && (found == false)){
            if (value [k] > newGuy){
                value [k+1] = value [k];
                k--;
            } // end if
            else {
                value [k+1] = newGuy;
                found = true;
            }  // end else
        } // end while
    }  // end magic

    public static void  main (String [] args)
    {
        int[]  list = new int[8];
        int i;

        for (i = 0; i < 6; i++){
            list[i] = i * 2;
        }
        show(list, 6);
        magic(list, 5, 6);
        show(list, 7);
    } // end main
} // end class