/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Entitites.*;

/**
 *
 * @author Raffy
 */
public class TableFunctions {

    public static TabelModel2 updateBookofDepTable(Department d, Book b) {
        String[] columnNames = {"Name", "Price", "Serial", "Number of Copies"};
        Object[][] data = new Object[(d.book).size() + 1][4];
        d.addBook(b);
        for (int i = 0; i < (d.book).size(); i++) {
            data[i][0] = (d.book.get(i)).getName();
            data[i][1] = (d.book.get(i)).getPrice();
            data[i][2] = (d.book.get(i)).getSerial();

            data[i][3] = (d.book.get(i)).getNumberOfCopies();
        }
        TabelModel2 model = new TabelModel2(data, columnNames);
        return model;

    }

    public static TabelModel2 updateBookofDepTable(Department d) {
        String[] columnNames = {"Name", "Price", "Serial", "Number of Copies"};
        Object[][] data = new Object[(d.book).size()][4];

        for (int i = 0; i < (d.book).size(); i++) {
            data[i][0] = (d.book.get(i)).getName();
            data[i][1] = (d.book.get(i)).getPrice();
            data[i][2] = (d.book.get(i)).getSerial();
            data[i][3] = (d.book.get(i)).getNumberOfCopies();
        }
        TabelModel2 model = new TabelModel2(data, columnNames);
        return model;
    }

    public static TabelModel updateSuppliersTable() {
        String[] columnNames = {"Name", "Email", "Address"};
        Object[][] data = new Object[(Library.supplier).size()][3];
        for (int i = 0; i < (Library.supplier).size(); i++) {
            data[i][0] = (Library.supplier.get(i)).getName();
            data[i][1] = (Library.supplier.get(i)).getEmail();
            data[i][2] = (Library.supplier.get(i)).getAddress();

        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;

    }

    public static TabelModel updateSuppliersTable(Supplier s) {
        String[] columnNames = {"Name", "Email", "Address"};
        Object[][] data = new Object[(Library.supplier).size() + 1][3];
        Library.addSupplier(s);

        for (int i = 0; i < (Library.supplier).size(); i++) {
            data[i][0] = (Library.supplier.get(i)).getName();
            data[i][1] = (Library.supplier.get(i)).getEmail();
            data[i][2] = (Library.supplier.get(i)).getAddress();

        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;

    }

    public static TabelModel updateBookofSuppTable(Supplier s, Book b) {
        String[] columnNames = {"Name", "Price", "Serial"};
        Object[][] data = new Object[(s.book).size() + 1][3];
        s.addBook(b);
        for (int i = 0; i < (s.book).size(); i++) {
            data[i][0] = (s.book.get(i)).getName();
            data[i][1] = (s.book.get(i)).getPrice();
            data[i][2] = (s.book.get(i)).getSerial();

        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;

    }

    public static TabelModel updateBookofSuppTable(Supplier s) {
        String[] columnNames = {"Name", "Price", "Serial"};
        Object[][] data = new Object[(s.book).size()][3];

        for (int i = 0; i < (s.book).size(); i++) {
            data[i][0] = (s.book.get(i)).getName();
            data[i][1] = (s.book.get(i)).getPrice();
            data[i][2] = (s.book.get(i)).getSerial();

        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;
    }

    public static TabelModel updateDepartmentsTable() {
        String[] columnNames = {"Name", "Code"};
        Object[][] data = new Object[Library.department.size()][2];

        for (int i = 0; i < Library.department.size(); i++) {
            data[i][0] = (Library.department.get(i)).getName();
            data[i][1] = (Library.department.get(i)).getCode();

        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;

    }

    public static TabelModel updateDepartmentsTable(Department d) {
        String[] columnNames = {"Name", "Code"};
        Object[][] data = new Object[Library.department.size() + 1][2];
        Library.department.add(d);

        for (int i = 0; i < Library.department.size(); i++) {
            data[i][0] = (Library.department.get(i)).getName();
            data[i][1] = (Library.department.get(i)).getCode();

        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;

    }

    public static TabelModel updateCustomersTable() {
        String[] columnNames = {"Name", "ID", "Email", "Address"};
        Object[][] data = new Object[Library.customer.size()][4];

        for (int i = 0; i < Library.customer.size(); i++) {
            data[i][0] = (Library.customer.get(i)).getName();
            data[i][1] = (Library.customer.get(i)).getId();
            data[i][2] = Library.customer.get(i).getEmail();
            data[i][3] = Library.customer.get(i).getAddress();
          
        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;

    }

    public static TabelModel updateCustomersTable(Customer c) {
        String[] columnNames = {"Name", "ID", "Email", "Address"};
        Object[][] data = new Object[Library.customer.size() + 1][4];
        Library.customer.add(c);

        for (int i = 0; i < Library.customer.size(); i++) {
            data[i][0] = (Library.customer.get(i)).getName();
            data[i][1] = (Library.customer.get(i)).getId();
            data[i][2] = Library.customer.get(i).getEmail();
            data[i][3] = Library.customer.get(i).getAddress();
         

        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;
    }

    public static TabelModel3 updateBookofCustTable(Customer c) {
        String[] columnNames = {"Name", "Price", "Serial", "Number of Copies"};
        Object[][] data = new Object[(c.book).size()][4];

        for (int i = 0; i < (c.book).size(); i++) {
            data[i][0] = (c.book.get(i)).getName();
            data[i][1] = (c.book.get(i)).getPrice();
            data[i][2] = (c.book.get(i)).getSerial();
            data[i][3] = (c.book.get(i)).getNumberOfCopies();

        }
        TabelModel3 model = new TabelModel3(data, columnNames);
        return model;
    }

    public static TabelModel3 updateBookofCustTable(Customer c, Book b) {
        String[] columnNames = {"Name", "Price", "Serial", "Number of Copies"};
        Object[][] data = new Object[(c.book).size() + 1][4];
        c.addBook(b);

        for (int i = 0; i < (c.book).size(); i++) {
            data[i][0] = (c.book.get(i)).getName();
            data[i][1] = (c.book.get(i)).getPrice();
            data[i][2] = (c.book.get(i)).getSerial();
            data[i][3] = (c.book.get(i)).getNumberOfCopies();

        }
        TabelModel3 model = new TabelModel3(data, columnNames);
        return model;
    }

    public static TabelModel3 updateSuppofDepTable(Department d, Supplier s) {
        String[] columnNames = {"Name", "Email", "Address"};
        Object[][] data = new Object[(d.supplier).size() + 1][3];
        d.addSupplier(s);

        for (int i = 0; i < (d.supplier).size(); i++) {
            data[i][0] = (d.supplier.get(i)).getName();
            data[i][1] = (d.supplier.get(i)).getEmail();
            data[i][2] = (d.supplier.get(i)).getAddress();

        }
        TabelModel3 model = new TabelModel3(data, columnNames);
        return model;
    }

    public static TabelModel3 updateSuppofDepTable(Department d) {
        String[] columnNames = {"Name", "Email", "Address"};
        Object[][] data = new Object[(d.supplier).size()][3];

        for (int i = 0; i < (d.supplier).size(); i++) {
            data[i][0] = (d.supplier.get(i)).getName();
            data[i][1] = (d.supplier.get(i)).getEmail();
            data[i][2] = (d.supplier.get(i)).getAddress();

        }
        TabelModel3 model = new TabelModel3(data, columnNames);
        return model;
    }

    public static TabelModel updateEmpofDepTable(Department d) {
        String[] columnNames = {"Name", "ID", "Email", "Address", "Position", "Salary"};
        Object[][] data = new Object[(d.employee).size()][6];
        for (int i = 0; i < d.employee.size(); i++) {
            data[i][0] = d.employee.get(i).getName();
            data[i][1] = d.employee.get(i).getId();
            data[i][2] = d.employee.get(i).getEmail();
            data[i][3] = d.employee.get(i).getAddress();
            data[i][4] = d.employee.get(i).getPosition();
            data[i][5] = d.employee.get(i).getSalary();
        }

        TabelModel model = new TabelModel(data, columnNames);
        return model;
    }

    public static TabelModel updateEmpofDepTable(Department d, Employee e) {
        String[] columnNames = {"Name", "ID", "Email", "Address", "Position", "Salary"};
        Object[][] data = new Object[(d.employee).size() + 1][6];
        d.addEmployee(e);
        for (int i = 0; i < d.employee.size(); i++) {
            data[i][0] = d.employee.get(i).getName();
            data[i][1] = d.employee.get(i).getId();
            data[i][2] = d.employee.get(i).getEmail();
            data[i][3] = d.employee.get(i).getAddress();
            data[i][4] = d.employee.get(i).getPosition();
            data[i][5] = d.employee.get(i).getSalary();
        }

        TabelModel model = new TabelModel(data, columnNames);
        return model;
    }

}
