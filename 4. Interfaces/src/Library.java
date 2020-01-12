public class Library {  //Main class.

    public static void main(String[] args) {

        //Sample values.
        String name = "Book Number 1";
        String publisher = "The Example Publisher of Books";
        int numPages = 1000;
        String name2 = "Magazine Number 1";
        String publisher2 = "The Example Publisher of Magazines";
        int numPages2 = 100;
        int IdNumber = 1515;
        String name3 = "Book Number 2";

        //Creating new articles.
        Publication book1 = new Publication(name, publisher, numPages);
        Publication magazine1 = new Publication(name2, publisher2, numPages2);
        Publication book2 = new Publication(name3, publisher, numPages);
        Book book3 = new Book(name3, publisher, numPages);

        //Show inital information of the Publications created before.
        System.out.println("TEST: Information about the Publications.");
        System.out.println("Publication 1: "+book1.toString());
        System.out.println("Publication 2: "+book2.toString());
        System.out.println("Publication 3: "+magazine1.toString());

        //Lend a book.
        System.out.println("TEST: Lend a book (available).");
        if((book3.isAvailable())==false){
            System.out.println("Book is not available.");
        }else{
            book3.setAvailable(false);
            System.out.println("The book has been lent.");
        }

        System.out.println("TEST: Lend a book (no available).");
        if((book3.isAvailable())==false){
            System.out.println("Book is not available.");
        }else{
            book3.setAvailable(false);
            System.out.println("The book has been lent.");
        }

        //Return a book.
        System.out.println("TEST: Return a book.");
        book3.setAvailable(true);
        System.out.println("Book has been returned.");
    }
}
