
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int count) {
        int i = 1;
        while (i <= count) {
            System.out.println(i);
            i++;
        }
    }
}
