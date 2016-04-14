package Entitites;


import java.util.ArrayList;

public class Customer extends Person {

    int numberOfBooks;
   public ArrayList<Book> book = new ArrayList<Book>();

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
         book=new ArrayList<Book>();
    }

    void setNumberOfBooks(int n) {
        this.numberOfBooks = n;
    }

    int getNumberOfBooks() {
        return numberOfBooks;
    }
}
