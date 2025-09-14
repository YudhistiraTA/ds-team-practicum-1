import java.util.Scanner;

public class Admin extends User {
    private Scanner scanner = new Scanner(System.in);

    public void addBook(BookList bookList) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        bookList.addBook(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    public void removeBook(BookList bookList) {
        bookList.print();
        if (!bookList.getBooks().isEmpty()) {
            System.out.print("Enter book number to remove: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine(); // consume newline
            if (index >= 0 && index < bookList.getBooks().size()) {
                Book removed = bookList.getBooks().get(index);
                bookList.removeBook(removed);
                System.out.println("Book removed: " + removed.getTitle());
            } else {
                System.out.println("Invalid book number.");
            }
        }
    }
}
