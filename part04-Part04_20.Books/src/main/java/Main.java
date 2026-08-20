
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> info = new ArrayList<>();
        while (true) {

            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            } else {

                int pages = Integer.valueOf(scanner.nextLine());

                int year = Integer.valueOf(scanner.nextLine());
                info.add(new Book(name, pages, year));
            }
        }

        String ans = scanner.nextLine();
        if (ans.equals("name")) {
            for (Book book : info) {
                book.name();
            }
        }
        if (ans.equals("everything")) {
            for (Book book : info) {
                book.everyThing();
            }
        }
    }
}
