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

    public void deleteBook(int i) {
        book.remove(i);
    }

    public void deleteAllBooks() {
        book = new ArrayList<Book>();
    }

    public void addSupplier(Supplier s) {
        supplier.add(s);

    }

    public void modifySupplier(int i, String name, String email, String address) {
        supplier.set(i, new Supplier(name, email, address));
    }

    public void deleteSupplier(int i) {
        supplier.remove(i);
    }

    public void deleteAllSuppliers() {
        supplier = new ArrayList<Supplier>();
    }

    public void addEmployee(Employee e) {
        employee.add(e);

    }

    public void modifyEmployee(int i, Employee e) {
        employee.set(i, e);
    }

    public void deleteEmployee(int i) {
        employee.remove(i);
    }

    public void deleteAllEmployees() {
        employee = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
