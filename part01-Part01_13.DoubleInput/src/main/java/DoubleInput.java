
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");     // write your program here
String number = scanner.nextLine();
Double value = Double.valueOf(number);
        System.out.println("You gave the number " + value);
    }
}
