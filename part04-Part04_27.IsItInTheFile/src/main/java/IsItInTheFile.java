
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String toSearch = scanner.nextLine();
        boolean ans = false;
        try ( Scanner name = new Scanner(Paths.get(file))) {
            while (name.hasNextLine()) {
                String txt = name.nextLine();
                if (toSearch.equals(txt)) {
                    ans = true;
                    break;
                }
            }
            if (ans) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
