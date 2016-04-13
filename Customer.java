
import java.util.ArrayList;


public class Customer extends Person {
  int numberOfBooks;
        ArrayList<Book> book = new ArrayList<Book>();
        public Customer(String name,String id,String email,String address,int numberOfBooks){super(name,id,email,address);
        this.numberOfBooks=numberOfBooks;
        }
 public void addBook(String name, String serial,float price,int numberOfCopies){
       book.add(new Book(name,serial,price,numberOfCopies));

   }
   
   public void modifyBook(int i,String name, String serial,float price,int numberOfCopies){
   book.set(i,new Book(name,serial,price,numberOfCopies));
   }
  void deleteBook(int i){
    book.remove(i);  
}
  void setNumberOfBooks(int n){this.numberOfBooks=n;}
  int getNumberOfBooks(){return numberOfBooks;}
}
