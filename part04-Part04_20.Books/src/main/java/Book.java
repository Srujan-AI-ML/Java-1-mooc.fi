
public class Book {

    private String name;
    private int pages;
    private int year;

    public Book(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public void everyThing() {
        System.out.println(name + ", " + pages + " pages" + ", " + year);

    }

    public void name() {
        System.out.println(name);
    }

}
