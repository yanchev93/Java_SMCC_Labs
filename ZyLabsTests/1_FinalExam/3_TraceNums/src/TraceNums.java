package src;

public class TraceNums{
    public static void main (String[] args){
        int i, j, k, num1, num2;

        num1 = 0;
        num2 = 0;
        k = 3;
        for (i = 1; i <=k; i++){
            num1 += 3;
            for (j = 1; j <=i; j++){
                num2++;
            } // for j
        } // for i
        System.out.println("num1 = " + num1 + " num2 = " + num2 );
    }
}