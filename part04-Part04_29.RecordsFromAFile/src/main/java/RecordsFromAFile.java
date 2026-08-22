
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        try ( Scanner fileName = new Scanner(Paths.get(name))) {
            while (fileName.hasNextLine()) {
                String txt = fileName.nextLine();
                String[] parts = txt.split(",");
                String context = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(context + ", " + "age: " + age + " years");
            }

        } catch (Exception e) {

        }
    }
}
