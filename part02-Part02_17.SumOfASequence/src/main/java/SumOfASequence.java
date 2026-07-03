
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int n = 1;
        while (n <= number) {

            sum += n;
            n++;
        }
        System.out.println(sum);
    }
}
