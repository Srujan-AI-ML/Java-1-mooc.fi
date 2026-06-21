
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        if (number1 > number2) {
            System.out.println("(first) is greater than (second).");
        } else if (number1 < number2) {
            System.out.println("(first) is smaller than (second).");
        } else if (number1 == number2) {
            System.out.println("(first) is equal to (second).");
        }
    }
}
