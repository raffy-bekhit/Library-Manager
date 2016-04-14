package Entitites;

import java.util.ArrayList;

public class Supplier extends Person {

    public ArrayList<Book> book = new ArrayList<Book>();

    public Supplier(String name, String email, String address) {
        super(name, null, email, address);
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
        book=new ArrayList<Book>();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override

    public String getEmail() {
        return super.getEmail();
    }

    @Override

    public String getAddress() {
        return super.getAddress();
    }

}
