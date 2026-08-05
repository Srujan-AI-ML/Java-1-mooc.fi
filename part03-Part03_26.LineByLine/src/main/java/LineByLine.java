
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String ans = scanner.nextLine();
            if (ans.isEmpty()) {
                break;
            } else {
                String[] pieces = ans.split(" ");
                for (String piece : pieces) {
                    System.out.println(piece);
                }

            }

        }

    }
}
