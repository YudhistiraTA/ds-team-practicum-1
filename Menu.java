import java.util.Scanner;

public class Menu {
    private BookList books;
    private User user;
    private boolean hasNotExited = true;
    private Scanner scanner;

    public Menu(BookList books, User user, Scanner scanner) {
        this.books = books;
        this.user = user;
        this.scanner = scanner;
    }

    private void display() {
        System.out.println("Welcome, " + user.getName());
        System.out.println("1. View Books");
        if (user instanceof Member) {
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
        } else {
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
        }
        System.out.println("0. Exit");
    }

    private void selectOption() {
        int option = -1;
        option = scanner.nextInt();
        switch (option) {
            case 1:
                books.print();
                break;
            case 2:
                if (user instanceof Member) {
                    ((Member) user).borrowBook(books);
                } else {
                    ((Admin) user).addBook(books);
                }
                break;
            case 3:
                if (user instanceof Member) {
                    ((Member) user).returnBook(books);
                } else {
                    ((Admin) user).removeBook(books);
                }
                break;
            case 0:
                System.out.println("Exiting...");
                hasNotExited = false;
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void run() {
        do {
            display();
            selectOption();
        } while (hasNotExited);
    }
}