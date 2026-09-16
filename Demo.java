import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {   

        // Collection<Integer> nums=new ArrayList<Integer>();  //no need to loop through the arraylist
        // Collection nums=new ArrayList(); 
        //if you want to working with indexes than you have to use List

        List<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(5));
        // nums.add("dasda");
        
        // for(int n :nums){
        // for(Object n :nums){
            // int num=(Integer)n;
        //    System.out.println(n);
        // }
        // System.out.println(nums);  
    }
}

    