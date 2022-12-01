package deduplication;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Book> bucket = new HashSet<Book>();
        bucket.add(new Book("1000", "Outliers", "Malcom Gladwell"));
        bucket.add(new Book("1000", "Outliers", "Malcom Gladwell"));
        bucket.add(new Book("1001", "John Grisham", "Time to Kill"));
        bucket.add(new Book("1000", "Outliers", "Malcom Gladwell"));

        Iterator<Book> iterator = bucket.iterator();

        while (iterator.hasNext()) { // has items are available or not? if (available)
            Book b = iterator.next(); // take the first element
            System.out.println("Book Id: " + b.bookId + " Author: " + b.author + "Book Name: " + b.bookName);

        }


    }

}











