import java.util.Scanner;

public class NumberUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Calling the method and printing the result
        int value = numberUno();
        System.out.println("The value is: " + value);
        
        scanner.close();
    }

    // Your method definition
    public static int numberUno() {
        return 1;
    }
}

