
public class Timer {

    private ClockHand hundreds;
    private ClockHand second;

    public Timer() {
        this.second = new ClockHand(60);
        this.hundreds = new ClockHand(100);
    }

    public void advance() {
        this.hundreds.advance();
        if (this.hundreds.value() == 0) {
            this.second.advance();
        }
    }

    public String toString() {
        return second + ":" + hundreds;
    }
}
