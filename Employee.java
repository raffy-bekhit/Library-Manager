

public class Employee extends Person{
    private String position;
    private float salary;
    
    public Employee (String name, String id , String email , String address, String position , float salary){
        super(name, id , email , address);
        this.position = position;
        this.salary = salary;
        
    }
    
    public void setPosition (String x){
        position = x;
    }
    public String getPosition (){
        return position;
    }
    public void setSalary (float x){
        salary = x;
    }
    public float getSalary (){
        return salary;
    }
    
}
