
import java.awt.List;
import java.util.ArrayList;

public class Library {

    private String name;
    ArrayList<Department> department = new ArrayList<Department>();
    ArrayList<Customer> customer = new ArrayList<Customer>();

    public void addDepartment(Department d) {
        department.add(d);

    }

    public void modifyDepartment(int i, Department d) {
        department.set(i, d);
    }

    void deleteDepartment(int i) {
        department.remove(i);
    }

    void deleteAllDepartments() {
        for (int i = 0; i < department.size(); i++) {
            deleteDepartment(i);
        }
    }

    public void addCustomer(Customer c) {
        customer.add(c);

    }

    public void modifyCustomer(int i, Customer c) {
        customer.set(i, c);
    }

    void deleteCustomer(int i) {
        customer.remove(i);
    }

    void deleteAllCustomers() {
        for (int i = 0; i < customer.size(); i++) {
            deleteCustomer(i);
        }
    }
}
