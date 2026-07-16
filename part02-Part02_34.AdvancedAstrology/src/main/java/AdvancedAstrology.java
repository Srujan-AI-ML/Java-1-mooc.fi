
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int x = 1; x <= size; x++) {
            printSpaces(size - x);
            printStars(x);
        }
    }

    public static void christmasTree(int height) {
        for (int y = 1; y <= height; y++) {
            printSpaces(height - y);
            printStars(2 * y - 1);
        }
        for (int g = 0; g < 2; g++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }

    public static void printRectangle(int width, int height) {
        for (int x = 0; x < height; x++) {
            printStars(width);
        }
    }
}
