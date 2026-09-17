import java.util.ArrayList;

class Humman{
    public void sleep(){
         System.out.println("Humans need to sleep well...");

    }
}
class Employee extends Humman{
    @Override 
    public void sleep(){
         System.out.println("Employees need to sleep well to stay productive...");


    }
}

public class Demo {
   public static void main(String[] args) {
     
    Humman humman=new Humman();
    Employee emp1=new Employee();
    
    humman=emp1;


    // ArrayList<Humman> hummanList=new ArrayList<>();
    // ArrayList<Employee> employeeList=new ArrayList<>();

    //while using wild card its possible 
    ArrayList<?> hummanList=new ArrayList<>();
    ArrayList<Employee> employeeList=new ArrayList<>();

    hummanList=employeeList;  //not happen in array list


   ArrayList<Humman> hummanList2=new ArrayList<>();


    System.out.println(hummanList);
    hummanList=hummanList2;
   }
    
}

    