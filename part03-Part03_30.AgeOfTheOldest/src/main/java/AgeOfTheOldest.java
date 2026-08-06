
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] list = input.split(",");
            int age = Integer.parseInt(list[1]);
            if (age > oldestAge) {
                oldestAge = age;
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
