public class Book {
    // Variable to store the title of the book
    String title;

    // Constructor to initialize the book title when creating an object
    public Book(String bookTitle) {
        title = bookTitle;
    }

    public static void main(String[] args) {
        // Create a new Book object and pass the title " JAVA BASICS "
        Book myBook = new Book(" JAVA BASICS ");
        
        // Print the book title to the console
        System.out.println("Book Title: " + myBook.title);
    }
}
