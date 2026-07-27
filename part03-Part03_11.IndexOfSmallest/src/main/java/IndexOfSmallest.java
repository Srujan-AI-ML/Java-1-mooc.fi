
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }

        }

        System.out.println("Smallest number: " + smallest);

        for (int x = 0; x < list.size(); x++) {
            if (smallest == list.get(x)) {
                System.out.println("Found at index: " + x);
            }
        }

    }
}
