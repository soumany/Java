package OOP;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    public void checkoutBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book checked out: " + book.getTitle());
        } else {
            System.out.println("Book not found: " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }

    public void generateReport() {
        System.out.println("Library Report:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class OOP7 {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Python Basics", "Jane Smith");
        library.addBook(book1);
        library.addBook(book2);

        // Generating report
        library.generateReport();

        // Removing a book
        library.removeBook(book1);

        // Checking out a book
        library.checkoutBook(book2);

        // Generating report again
        library.generateReport();

        // Returning a book
        library.returnBook(book2);

        // Generating final report
        library.generateReport();
    }
}