
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000) {
            double price1 = 100 + (value - 5000) * 0.08;
            System.out.println("Tax: " + price1);
        } else if (value >= 25000 && value < 55000) {
            double price2 = 1700 + (value - 25000) * 0.1;
            System.out.println("Tax: " + price2);
        } else if (value >= 55000 && value < 200000) {
            double price3 = 4700 + (value - 55000) * 0.12;
            System.out.println("Tax: " + price3);
        } else if (value >= 200000 && value < 1000000) {
            double price4 = 22100 + (value - 200000) * 0.15;
            System.out.println("Tax: " + price4);
        } else if (value >= 1000000) {
            double price5 = 142100 + (value - 1000000) * 0.17;
            System.out.println("Tax: " + price5);

        }

    }
}
