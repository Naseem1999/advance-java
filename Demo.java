import java.util.ArrayList;
import java.util.List;

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

class Student{

}

public class Demo {
   public static void main(String[] args) {
     
    
    // humman=emp1;


    // ArrayList<Humman> hummanList=new ArrayList<>();
    // ArrayList<Employee> employeeList=new ArrayList<>();

    //while using wild card its possible 
//     ArrayList<?> hummanList=new ArrayList<>();
//     ArrayList<Employee> employeeList=new ArrayList<>();

//     hummanList=employeeList;  //not happen in array list


//    ArrayList<Humman> hummanList2=new ArrayList<>();


//     System.out.println(hummanList);
//     hummanList=hummanList2;

    //    ArrayList<? extends Humman> hummanList=new ArrayList<>();   //upper bound  any class that extends humman

    //    ArrayList<Employee> empList=new ArrayList<>();
    //    ArrayList<String> strList=new ArrayList<>();
    //    ArrayList<Object> objectList=new ArrayList<>();

    //    hummanList=empList;

    //    ArrayList<Humman> hummanList2=new ArrayList<>();
    //    hummanList=hummanList2;

    // //    hummanList=strList;     //gives error  because string is not in any relation with humman class
    // //    hummanList=objectList;

        Humman humman=new Humman();
        Humman humman2=new Humman();

       Employee emp=new Employee();
       Employee emp2=new Employee();

    //    ArrayList<? super Humman> hummanList=new ArrayList<>();   //lower bound   it is working with a humman type or a prrent of humman

       ArrayList<Employee> empList=new ArrayList<>();

       empList.add(emp);
       empList.add(emp2);
    //    ArrayList<String> strList=new ArrayList<>();
    //    ArrayList<Object> objectList=new ArrayList<>();

    //    hummanList=empList;   //it gives compile time errroer becuause it is not a parent

       ArrayList<Humman> hummanList2=new ArrayList<>();
       ArrayList<Student> studList2=new ArrayList<>();
       studList2.add(new Student());
       hummanList2.add(humman);
       hummanList2.add(humman2);
       Demo.invokeSleep(empList);
    //    Demo.invokeSleep(studList2);  //gives error becuase student class is not a child of Humman
    //    hummanList=hummanList2;

    //    hummanList=strList;     //gives error  because string is not in any relation with humman class
    //    hummanList=objectList;
   }

   public static void invokeSleep(List<? extends Humman> list){
         for(Humman humman:list){
            humman.sleep();
         }
   }
    
}

    