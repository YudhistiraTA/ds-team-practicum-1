import java.util.Scanner;

public class Member extends User {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void interact() {
        System.out.println("Member can borrow or return books.");
    }

    public void borrowBook(BookList bookList) {
        bookList.printAvailable();
        if (bookList.getCount() > 0) {
            System.out.print("Enter book number to borrow: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();
            Book book = bookList.getBook(index);
            if (book != null && !book.isBorrowed()) {
                book.borrowBook();
                System.out.println("You borrowed: " + book.getTitle());
            } else {
                System.out.println("Invalid choice or already borrowed.");
            }
        }
    }

    public void returnBook(BookList bookList) {
        bookList.printAll();
        System.out.print("Enter book number to return: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        Book book = bookList.getBook(index);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
            System.out.println("You returned: " + book.getTitle());
        } else {
            System.out.println("Invalid choice or book not borrowed.");
        }
    }
}
