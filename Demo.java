import java.util.ArrayList;

class Student{
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

class Employee{
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class Demo {
   public static void main(String[] args) {
    
    Student st1=new Student(1,"Rohan" );
    Student st2=new Student(2,"Rohit" );
    
    // Employee emp=new Employee(1,"naseem");

    ArrayList<Student> list=new ArrayList<>();
    list.add(st1);
    list.add(st2);
    // list.add(emp);
    for(Student s: list){
        System.out.println(s);
    }

   }
    
}

    