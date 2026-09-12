
public class Cube {

    private int edge;
    int vol;

    public Cube(int edge) {
        this.edge = edge;

    }

    public int volume() {
        vol = edge * edge * edge;
        return vol;
    }

    public String toString() {
        return "The length of the edge is " + this.edge + "and the volume " + vol;
    }
}
