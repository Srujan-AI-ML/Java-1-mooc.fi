
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }
            sum.addNumber(numbers);
            if (numbers % 2 == 0) {
                even.addNumber(numbers);
            } else {
                odd.addNumber(numbers);
            }
        }
        System.out.println("Sum:" + sum.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
