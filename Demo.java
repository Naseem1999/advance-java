import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age,String name){
        this.name=name;
        this.age=age;
    }

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	public int compareTo(Student that) {
          if(this.age > that.age){
                return 1;
             }else{
                return  -1;
             }	
            }
}
public class Demo {
    public static void main(String[] args) {   
    //  Map<String,Integer> students=new HashMap<>();
    //  Map<String,Integer> students=new Hashtable<>();
    //  students.put("Navin",32);
    //  students.put("Harsh",55);
    //  students.put("Sushil",67);
    //  students.put("Kiran",565);
    //  students.put("Harsh",23);


    //  System.out.println(students);
    //  System.out.println(students.get("Navin"));
    //  System.out.println(students.keySet());


    //  for(String key:students.keySet()){
    //     System.out.println(key +" : "+ students.get(key));
    //  }
    
    // Comparator<Integer> com=new Comparator<Integer>() {
    //     public int compare(Integer i,Integer j){
    //          if(i%10 >j%10){
    //             return 1;
    //          }else{
    //             return  -1;
    //          }
    //     }
    // };

    Comparator<Student> com=new Comparator<Student>() {
        public int compare(Student i,Student j){
             if(i.age >j.age%10){
                return 1;
             }else{
                return  -1;
             }
        }
    };
    // List<Integer> nums=new ArrayList<>();
    // nums.add(4);
    // nums.add(3);
    // nums.add(7);
    // nums.add(9);

    List<Student> studs=new ArrayList<>();
    studs.add(new Student(23, "navin"));
    studs.add(new Student(9, "john"));
    studs.add(new Student(3, "paural"));
    studs.add(new Student(12, "neeto"));

    // Collections.sort(studs,com);
    //  System.out.println(studs);

    
    Collections.sort(studs);
    
    for(Student s:studs){
        System.out.println(s);
    }

    List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
            System.out.println("Original List:  "+names);


    }

    Set<String> nam=new TreeSet<>();
    
}

    