
import java.awt.List;
import java.util.ArrayList;


public class Library {
    private String name ;
   ArrayList<Department> department =new ArrayList<Department>();
   ArrayList<Customer> customer = new ArrayList<Customer>(); 
  
   
   public void addDepartment(String name, String code){
       department.add(new Department(name,code));

   }
   
   public void modifyDepartment(int i,String name, String code){
   department.set(i,new Department(name,code));
   }
  void deleteDepartment(int i){
    department.remove(i);  
}
  
   public void addCustomer(String name, String id, String email, String address , int numberOfBooks){
       customer.add(new Customer(name,id,email,address,numberOfBooks));
       
   }
   
   public void modifyCustomer(int i,String name, String id, String email, String address , int numberOfBooks){
   customer.set(i,new Customer(name,id,email,address,numberOfBooks));
   }
  void deleteCustomer(int i){
    customer.remove(i);  
}
}
