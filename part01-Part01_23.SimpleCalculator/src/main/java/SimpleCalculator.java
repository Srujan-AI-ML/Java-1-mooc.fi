
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        int value1 = number1+number2;
        int value2 = number1-number2;
        int value3 = number1*number2;
        double value4 = 1.0*number1/number2;
        System.out.println(number1 + " + " + number2 + " = "  + value1);
System.out.println(number1 + " - " + number2 + " = "  + value2);
System.out.println(number1 + " * " + number2 + " = "  + value3);
System.out.println(number1 + " / " + number2 + " = "  + value4);








// Write your program here

    }
}
