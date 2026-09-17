import java.util.ArrayList;

class Student1<T>{
    T obj;
    Student1(T obj){
     this.obj=obj;
    }

    public void disp(){
        System.out.println("Type of data here T: "+obj.getClass().getName());
    }

    public T getObj(){
        return  obj;
    }

}

public class Demo {
   public static void main(String[] args) {
    
    Student1<Integer> st=new Student1<>(19);
    Student1<String> st1=new Student1<>("Naseem");

    st.disp();
    System.out.println(st.getObj());

    st1.disp();
    System.out.println(st1.getObj());

   }
    
}

    