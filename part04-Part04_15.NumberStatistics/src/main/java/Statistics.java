
public class Statistics {

    private int count;

    private int sum = 0;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum = this.sum + number;

    }

    public int getCount() {
        return this.count;
    }

    public int sum() {

        return sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * sum / this.count;
    }
}
