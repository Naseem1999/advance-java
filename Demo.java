import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {   
        Collection<Integer> nums=new TreeSet<Integer>();

        // Collection<Integer> nums=new ArrayList<Integer>();  //no need to loop through the arraylist
        // Collection nums=new ArrayList(); 
        //if you want to working with indexes than you have to use List

        // List<Integer> nums=new ArrayList<Integer>();
        // Set<Integer> nums=new HashSet<Integer>(); //set is not following the sequence set does not support index value
        //if you want sorting then use treeselect
        // Set<Integer> nums=new TreeSet<Integer>();


        nums.add(62);
        nums.add(54);
        nums.add(84);
        nums.add(24);
        nums.add(63);
        
        
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(6));
        // nums.add("dasda");
        
        // for(int n :nums){
            // for(Object n :nums){
                //     int num=(Integer)n;
                //    System.out.println(num*2);
                // }
                
        Iterator<Integer> values=nums.iterator();
        while(values.hasNext())
               System.out.println(values.next());
        // for(int n:nums){
        //     System.out.println(n);
        // }
        // System.out.println(nums);  
    }
}

    