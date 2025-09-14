import java.util.Scanner;

public class Admin extends User {
    private Scanner scanner = new Scanner(System.in);

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
        bookList.printAll();
        if (bookList.getCount() > 0) {
            System.out.print("Enter book number to remove: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();
            bookList.removeBook(index);
        }
    }
}
