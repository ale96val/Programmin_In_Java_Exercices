public class Magazine extends Publication implements Available{

    private int IdNumber;
    private boolean available;

    public Magazine(String name, String publisher, int numPages, int idNumber) {  //Default constructor including super.
        super(name, publisher, numPages);
        IdNumber = idNumber;
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

    //To String with specific information of Magazine Class
    public String toString() {
        return "Magazine{" +
                "IdNumber=" + IdNumber +
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
