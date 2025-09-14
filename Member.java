import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    private List<Book> borrowedBooks;

    public Member(int id, String name, String username, String password) {
        super(id, name, username, password);
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        if (book.isBorrowed() && borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}