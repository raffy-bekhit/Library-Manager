
import java.util.ArrayList;

public class Customer extends Person {

    int numberOfBooks;
    ArrayList<Book> book = new ArrayList<Book>();

    public Customer(String name, String id, String email, String address, int numberOfBooks) {
        super(name, id, email, address);
        this.numberOfBooks = numberOfBooks;
    }

    public void addBook(Book b) {
        book.add(b);

    }

    public void modifyBook(int i, Book b) {
        book.set(i, b);
    }

    void deleteBook(int i) {
        book.remove(i);
    }

    void deleteAllBooks() {
        for (int i = 0; i < book.size(); i++) {
            deleteBook(i);
        }
    }

    void setNumberOfBooks(int n) {
        this.numberOfBooks = n;
    }

    int getNumberOfBooks() {
        return numberOfBooks;
    }
}
