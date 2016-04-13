
import java.util.ArrayList;


public class Supplier extends Person{
   
    ArrayList<Book> book = new ArrayList<Book>();
    public Supplier(String name,String email,String address)
    {
    super(name,null,email,address);}

 public void addBook(String name, String serial,float price,int numberOfCopies){
       book.add(new Book(name,serial,price,numberOfCopies));

   }
   
   public void modifyBook(int i,String name, String serial,float price,int numberOfCopies){
   book.set(i,new Book(name,serial,price,numberOfCopies));
   }
  void deleteBook(int i){
    book.remove(i);  
}
 
}
