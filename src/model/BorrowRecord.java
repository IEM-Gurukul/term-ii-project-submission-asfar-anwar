package model;

public class BorrowRecord {

    private String bookId;
    private String memberId;

    public BorrowRecord(String bookId, String memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public String getBookId() { return bookId; }
    public String getMemberId() { return memberId; }

    public void displayRecord() {
        System.out.println("Book ID: " + bookId + ", Borrowed by Member ID: " + memberId);
    }
}