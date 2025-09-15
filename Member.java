import java.util.Scanner;

public class Member extends User {
    public Member(int id, String name, String username, String password, Scanner scanner) {
        super(id, name, username, password, scanner);
    }

    @Override
    public void interact() {
        System.out.println("Member can borrow or return books.");
    }

    public void borrowBook(BookList bookList) {
        bookList.print();
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
        bookList.print();
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