package deduplication;

import org.junit.jupiter.api.*;

import java.util.*;

class AppTest {

    Book b1 = new Book("1000", "Outliers", "Malcom Gladwell");
    Book b2 = new Book("1001", "John Grisham", "Time to Kill");

    Book b3 = new Book("1001", "John Grisham", "Time to Kill");


    @Test
    public void testWithDuplicateBooks() {
        HashSet<Book> bucket = new HashSet<Book>();

        //Book book = new Book("1000", "Outliers", "Malcom Gladwell");
        bucket.add(b1);
        bucket.add(b2);
        bucket.add(b3);

        int totalSize = bucket.size();
        Assertions.assertEquals(2, totalSize);

    }


    @Test
    public void verifyBookInformation() {
        HashSet<Book> bucket = new HashSet<Book>();
        bucket.add(b1);
        bucket.add(b1);


        int totalSize = bucket.size();
        Assertions.assertEquals(1, totalSize);
        Iterator<Book> iterator = bucket.iterator();

        while (iterator.hasNext()) {
            Book b = iterator.next();
            Assertions.assertEquals("1000", b.bookId);
            Assertions.assertEquals("Outliers", b.bookName);
            Assertions.assertEquals("Malcom Gladwell", b.author);
        }
    }
}
