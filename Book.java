class BorrowStatus {
    private String memberId;
    private String borrowDate;
    private String returnDate;

    public BorrowStatus(String memberId, String borrowDate, String returnDate) {
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
}

public class Book {
    private String title;
    private String author;
    private BorrowStatus borrowStatus;

    public Book(String title, String author, BorrowStatus borrowStatus) {
        this.title = title;
        this.author = author;
        this.borrowStatus = borrowStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BorrowStatus getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(BorrowStatus borrowStatus) {
        this.borrowStatus = borrowStatus;
    }
}