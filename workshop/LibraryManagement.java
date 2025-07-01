package workshop;
import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<Book> books;
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book4 = new Book("RamaYana", "Valmiki");
        Book book5 = new Book("Mahabharata", "Vedavyasa");
        Book book6 = new Book("Shrimad Bhagavad Gita", "Vedavyasa");
        books = new ArrayList<>(Arrays.asList(book1,book2,book3,book4,book5,book6));
        book6.deleteBook();
        for(int i=0;i<books.size();i++) {
            Book book = books.get(i);
            if(book.isAvailable())System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
            else throw new RuntimeException("Book not available: " + book.getTitle());
        }
    }
}

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void deleteBook() {
        this.isAvailable = false;
    }
}
