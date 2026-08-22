
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        String file = scanner.nextLine();

        int lowerBound = Integer.valueOf(scanner.nextLine());

        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNextLine()) {
                String row = fileName.nextLine();
                int number = Integer.valueOf(row);
                if (number >= lowerBound && number <= upperBound) {

                    i++;
                }

            }

        } catch (Exception e) {

        }
        System.out.println("Numbers: " + i);
    }
}
