
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();
        
        String team = scanner.nextLine();
        int i = 0;
        int win = 0;
        int lose = 0;
        try ( Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                String[] data = row.split(",");
                if (data[0].equals(team) || data[1].equals(team)) {
                    i++;
                    if (Integer.valueOf(data[2]) > Integer.valueOf(data[3])) {
                        win++;
                    } else {
                        lose++;
                    }
                }

            }

        } catch (Exception e) {

        }
        System.out.println("Games:  " + i);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
