import model.Book;
import service.LibraryService;

public class Main {
    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        // Add books
        library.addBook(new Book("101", "Java Basics", "James Gosling"));
        library.addBook(new Book("102", "Data Structures", "Mark Allen"));

        // Display books
        System.out.println("\nAll Books:");
        library.displayBooks();

        // Issue book
        System.out.println("\nIssuing Book 101:");
        library.issueBook("101");

        // Try issuing again (edge case)
        library.issueBook("101");

        // Return book
        System.out.println("\nReturning Book 101:");
        library.returnBook("101");

        // Final display
        System.out.println("\nFinal Book Status:");
        library.displayBooks();
    }
}