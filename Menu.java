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
        System.out.println("4. Find Book");
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
            case 4:
                System.out.println("Enter title substring to search:");
                scanner.nextLine(); // consume newline
                String substring = scanner.nextLine();
                Book foundBook = books.findBook(substring);
                if (foundBook != null) {
                    System.out.println("Found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
                } else {
                    System.out.println("No book found with that title.");
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