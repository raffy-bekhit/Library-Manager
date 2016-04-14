package Entitites;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raffy
 */
public class Department {

    private String name;
    private String code;
    public ArrayList<Book> book = new ArrayList<Book>();
    public ArrayList<Supplier> supplier = new ArrayList<Supplier>();
    public ArrayList<Employee> employee = new ArrayList<Employee>();

    public Department(String name, String code) {
        this.name = name;
        this.code = code;
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

    public void addSupplier(Supplier s) {
        supplier.add(s);

    }

    public void modifySupplier(int i, String name, String email, String address) {
        supplier.set(i, new Supplier(name, email, address));
    }

    void deleteSupplier(int i) {
        supplier.remove(i);
    }

    void deleteAllSuppliers() {
        for (int i = 0; i < supplier.size(); i++) {
            deleteSupplier(i);
        }
    }

    public void addEmployee(Employee e) {
        employee.add(e);

    }

    public void modifyEmployee(int i, Employee e) {
        employee.set(i, e);
    }

    void deleteEmployee(int i) {
        employee.remove(i);
    }

    void deleteAllEmployees() {
        for (int i = 0; i < employee.size(); i++) {
            deleteEmployee(i);
        }
    }
}
