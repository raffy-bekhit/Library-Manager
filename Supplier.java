
import java.util.ArrayList;


public class Supplier extends Person{
   
    ArrayList<Book> book = new ArrayList<Book>();
    public Supplier(String name,String email,String address)
    {
    super(name,null,email,address);}

  public void addBook(Book b){
       book.add(b);

   }
   
   public void modifyBook(int i,Book b){
   book.set(i,b);
   }
  void deleteBook(int i){
    book.remove(i);  
}
  void deleteAllBooks(){
      for(int i=0;i<book.size();i++)
          deleteBook(i);}
 
}
