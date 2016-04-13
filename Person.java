
public class Person {
    String name;
    String id;
    String email;
    String address;
public Person(String name,String id,String email,String address)
{this.name=name;
this.email=email;
this.address=address;
this.id=id;
}

     public void setName (String x){
        name = x;
    }
    public String getName (){
        return name;
    }
     public void setId (String x){
        id = x;
    }
    public String getId (){
        return id;
    }
     public void setEmail (String x){
        email = x;
    }
    public String getEmail (){
        return email;
    }
     public void setAddress (String x){
        address = x;
    }
    public String getAddress (){
        return address;
    }
}
