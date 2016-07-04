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

    public void deleteBook(int i) {
        book.remove(i);
    }

    public void deleteAllBooks() {
        book = new ArrayList<Book>();
    }

    public void setNumberOfBooks(int n) {
        this.numberOfBooks = n;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

}
