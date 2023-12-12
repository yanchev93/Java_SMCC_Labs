import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> intList = new ArrayList<Integer>();

        for (i = 0; i < 5; ++i) {
            intList.add(i);
        }
        IntegerManager.printItems(intList);

        intList.add(1, 5);
        IntegerManager.printItems(intList);

        intList.remove(3);
        IntegerManager.printItems(intList);
    }
    public class IntegerManager {
        public static void printItems(ArrayList<Integer> numsList) {
            int i;

            System.out.print("items:");

            for (i = 0; i < numsList.size(); ++i) {
                System.out.print(" " + numsList.get(i));
            }

            System.out.println();
        }


    }
}
