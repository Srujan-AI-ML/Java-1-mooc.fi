
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String ans = scanner.nextLine();
            if (ans.isEmpty()) {
                break;
            }
            String[] list = ans.split(" ");
            System.out.println(list[0]);
        }
    }
}
