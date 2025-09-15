import java.util.Scanner;

public class Admin extends User {
    public Admin(int id, String name, String username, String password, Scanner scanner) {
        super(id, name, username, password, scanner);
    }

    @Override
    public void interact() {
        System.out.println("Admin can add or remove books.");
    }

    public void addBook(BookList bookList) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        bookList.addBook(new Book(title, author));
    }

    public void removeBook(BookList bookList) {
        bookList.print();
        if (bookList.getCount() > 0) {
            System.out.print("Enter book number to remove: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();
            bookList.removeBook(index);
        }
    }
}