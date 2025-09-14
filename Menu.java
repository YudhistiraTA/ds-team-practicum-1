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
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. View All Books");
        System.out.println("2. View Available Books");
        System.out.println("3. Search Book by Title");
        System.out.println("4. Borrow Book");
        System.out.println("5. Return Book");
        if (user instanceof Admin) {
            System.out.println("--- Admin Options ---");
            System.out.println("6. Add Book");
            System.out.println("7. Remove Book");
        }
        System.out.println("9. Switch User");
        System.out.println("0. Exit");
        System.out.print("Choose option: ");
    }


    private void selectOption() {
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1 -> books.printAll();
            case 2 -> books.printAvailable();
            case 3 -> {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                Book book = books.findBook(title);
                System.out.println(book != null ? book : "Book not found.");
            }
            case 4 -> {
                if (user instanceof Member) {
                    ((Member) user).borrowBook(books);
                } else {
                    System.out.println("Only members can borrow books.");
                }
            }
            case 5 -> {
                if (user instanceof Member) {
                    ((Member) user).returnBook(books);
                } else {
                    System.out.println("Only members can return books.");
                }
            }
            case 6 -> {
                if (user instanceof Admin) {
                    ((Admin) user).addBook(books);
                }
            }
            case 7 -> {
                if (user instanceof Admin) {
                    ((Admin) user).removeBook(books);
                }
            }
            case 9 -> {
                Login login = new Login();
                user = login.login(); // ganti user baru
            }
            case 0 -> {
                System.out.println("Exiting...");
                hasNotExited = false;
            }
            default -> System.out.println("Invalid option.");
        }
    }


    public void run() {
        do {
            display();
            selectOption();
        } while (hasNotExited);
    }
}