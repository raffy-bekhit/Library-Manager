package Entitites;

import java.awt.List;
import java.util.ArrayList;

abstract public class Library {

    private static String name;
    public static ArrayList<Department> department = new ArrayList<Department>();
    public static ArrayList<Customer> customer = new ArrayList<Customer>();
    public static ArrayList<Supplier> supplier = new ArrayList<Supplier>();

    public static void addDepartment(Department d) {
        department.add(d);

    }

    public static void modifyDepartment(int i, Department d) {
        department.set(i, d);
    }

    public static void deleteDepartment(int i) {
        department.remove(i);
    }

    public static void deleteAllDepartments() {
        department=new ArrayList<Department>();
    }

    public static void addCustomer(Customer c) {
        customer.add(c);

    }

    public static void modifyCustomer(int i, Customer c) {
        customer.set(i, c);
    }

    public static void deleteCustomer(int i) {
        customer.remove(i);
    }

    public static void deleteAllCustomers() {
        customer = new ArrayList<Customer>();
    }

    public static void addSupplier(Supplier s) {
        supplier.add(s);

    }

    public static void modifySupplier(int i, String name, String email, String address) {
        supplier.set(i, new Supplier(name, email, address));
    }

    public static void deleteSupplier(int i) {
        supplier.remove(i);
    }

  public static  void  deleteAllSuppliers() {
        supplier = new ArrayList<Supplier>();
        }
    }

