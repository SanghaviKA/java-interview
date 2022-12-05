package deduplication;

public class Book {
    String bookId;
    String bookName;
    String author;

    public Book(String bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

  public int hashCode() {
     int hashcode = 0;
        return hashcode;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            // truth table on AND operation
            return (book.bookId.equals(this.bookId)) && (book.bookName.equals(this.bookName)) && (book.author.equals(this.author));
        } else {
            return false;
        }
    }
}











