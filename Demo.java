import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {   
    //  Map<String,Integer> students=new HashMap<>();
     Map<String,Integer> students=new Hashtable<>();
     students.put("Navin",32);
     students.put("Harsh",55);
     students.put("Sushil",67);
     students.put("Kiran",565);
     students.put("Harsh",23);


     System.out.println(students);
     System.out.println(students.get("Navin"));
     System.out.println(students.keySet());


     for(String key:students.keySet()){
        System.out.println(key +" : "+ students.get(key));
     }

    }
}

    