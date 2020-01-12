public class Book extends Publication implements Available{

    private boolean available;

    public Book(String name, String publisher, int numPages) {  //Default constructor including super.
        super(name, publisher, numPages);
        this.available = true;
    }

    //Getters.
    public boolean isAvailable() {
        return available;
    }

    //Setters
    public void setAvailable(boolean available) {
        this.available = available;
    }

    //String with specific information of Book Class
    public String toString() {
        return "Book{" +
                "available=" + available +
                '}';
    }

    //Methods defined by the interface
    public void Lend() {
        available = false;
    }

    public void PickUp() {
        available = true;
    }

    public boolean available() {
        return available;
    }
}
