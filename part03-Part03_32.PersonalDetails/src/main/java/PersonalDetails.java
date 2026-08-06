
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String x = "";
        int sum = 0;
        int number = 0;
        while (true) {
            String ans = scanner.nextLine();
            if (ans.isEmpty()) {
                break;
            }
            String[] list = ans.split(",");
            String name = list[0];
            int count = name.length();
            if (count > length) {
                length = count;
                x = name;
            }
            int age = Integer.parseInt(list[1]);
            sum = sum + age;
            number++;
        }
        double avg = 1.0 * sum / number;

        System.out.println("Longest name: " + x);
        System.out.println("Average of the birth years: " + avg);

    }
}
