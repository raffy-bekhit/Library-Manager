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

    public static TabelModel updateBookofDepTable(Department d, Book b) {
        String[] columnNames = {"Name", "Price", "Serial", "Number of Copies"};
        Object[][] data = new Object[(d.book).size() + 1][4];
        d.addBook(b);
        for (int i = 0; i < (d.book).size(); i++) {
            data[i][0] = (d.book.get(i)).getName();
            data[i][1] = (d.book.get(i)).getPrice();
            data[i][2] = (d.book.get(i)).getSerial();

            data[i][3] = (d.book.get(i)).getNumberOfCopies();
        }
        TabelModel model = new TabelModel(data, columnNames);
        return model;

    }

    public static TabelModel updateBookofDepTable(Department d) {
        String[] columnNames = {"Name", "Price", "Serial", "Number of Copies"};
        Object[][] data = new Object[(d.book).size()][4];

        for (int i = 0; i < (d.book).size(); i++) {
            data[i][0] = (d.book.get(i)).getName();
            data[i][1] = (d.book.get(i)).getPrice();
            data[i][2] = (d.book.get(i)).getSerial();
            data[i][3] = (d.book.get(i)).getNumberOfCopies();
        }
        TabelModel model = new TabelModel(data, columnNames);
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

}
