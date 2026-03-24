package ui;

import model.Book;
import service.LibraryService;
import java.util.Scanner;

public class ConsoleUI {

    private LibraryService library = new LibraryService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    issueBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        library.addBook(new Book(id, title, author));
    }

    private void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        String id = scanner.nextLine();
        library.issueBook(id);
    }

    private void returnBook() {
        System.out.print("Enter Book ID to return: ");
        String id = scanner.nextLine();
        library.returnBook(id);
    }
}