import java.util.ArrayList;

public class Demo {
   public static void main(String[] args) {
    String names[]=new String[5];
  //Type safety
    // names[0]="Rohan";
    // names[1]="rohit";
    // names[2]="Haneen";
    
    // names[3]=3;
    // String name1=names[0];
    // String name2=names[1];

    
     ArrayList<String> list=new ArrayList<>();  //Generics

     list.add("Rohan");
     list.add("Ramish");
     list.add("Roman");
    //  list.add(10);
    

    String name1=list.get(0);
    String name2=list.get(1);
    String name3=list.get(2);
      System.out.println(name1.toUpperCase());
      System.out.println(name2.toUpperCase());
      System.out.println(name3.toUpperCase());


    //  String name1=(String)list.get(0);
    //  System.out.println(name1.toUpperCase());
    //  String name2=(String)list.get(3);
    //  System.out.println(name2.toUpperCase());



   }
    
}

    