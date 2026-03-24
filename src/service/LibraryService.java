package service;

import model.Book;
import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> books = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    // Display all books
    public void displayBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }

    // Issue book
    public void issueBook(String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId)) {
                if (!b.isIssued()) {
                    b.setIssued(true);
                    System.out.println("Book issued successfully");
                    return;
                } else {
                    System.out.println("Book already issued");
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }

    // Return book
    public void returnBook(String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId)) {
                if (b.isIssued()) {
                    b.setIssued(false);
                    System.out.println("Book returned successfully");
                    return;
                } else {
                    System.out.println("Book was not issued");
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }
}