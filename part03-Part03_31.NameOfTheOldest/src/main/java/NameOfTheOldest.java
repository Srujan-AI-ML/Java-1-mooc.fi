
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = -1;
        String oldestName = "";
        while (true) {
            String ans = scanner.nextLine();
            if (ans.isEmpty()) {
                break;
            }
            String[] list = ans.split(",");
            int age = Integer.parseInt(list[1]);
            String name = list[0];
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }

        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
