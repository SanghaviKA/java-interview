package deduplication;

import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        HashSet<Book> bucket = new HashSet<Book>();

        Book b1 = new Book("1000", "Outliers", "Malcom Gladwell");
        Book b2 = new Book("1001", "John Grisham", "Time to Kill");
        Book b3 = new Book("1000", "Outliers", "Malcom Gladwell");


        bucket.add(b1);
        bucket.add(b2);
        bucket.add(b3);

        Iterator<Book> iterator = bucket.iterator();

        while (iterator.hasNext()) {
            Book b = iterator.next();
           System.out.println("Book Id: " + b.bookId + "Book Name: " + b.bookName + " Author: " + b.author);

        }
    }
}











