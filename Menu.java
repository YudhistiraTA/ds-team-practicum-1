import java.util.Scanner;

public class Menu {
    private BookList books;
    private User user;
    private boolean hasNotExited = true;
    Scanner scanner = new Scanner(System.in);

    public Menu(BookList books, User user) {
        this.books = books;
        this.user = user;
    }

    private void display() {
        System.out.println("Welcome, " + user.getName());
        System.out.println("1. View Books");
        System.out.println("2. Borrow Book");
        System.out.println("3. Return Book");
        if (user instanceof Admin) {
            System.out.println("4. Add Book");
            System.out.println("5. Remove Book");
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
                // Borrow book logic
                break;
            case 3:
                // Return book logic
                break;
            case 4:
                if (user instanceof Admin) {
                    // Add book logic
                } else {
                    System.out.println("Invalid option.");
                }
                break;
            case 5:
                if (user instanceof Admin) {
                    // Remove book logic
                } else {
                    System.out.println("Invalid option.");
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