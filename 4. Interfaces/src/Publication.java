public class Publication {  //Parent class.

    private String name;
    private String publisher;
    private int numPages;

    public Publication(String name, String publisher, int numPages) {  //Default constructor.
        this.name = name;
        this.publisher = publisher;
        this.numPages = numPages;
    }
     //Getters.
    public String getPublisher() {
        return publisher;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getName() {
        return name;
    }

    //Setters.
    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    //Complete To String.
    public String toString() {
        return "Publication{" +
                "name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
