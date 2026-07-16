
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("");  // printing --- between the shapes
        printSquare(4);
        System.out.println(" ");
        printRectangle(5, 6);
        System.out.println(" ");
        printTriangle(3);
        System.out.println(" ");
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int n = 0; n < size; n++) {
            printStars(size);
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        for (int x = 0; x < height; x++) {
            printStars(width);
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        for (int y = 1; y <= size; y++) {
            printStars(y);
        }
        System.out.println("");
    }
}
