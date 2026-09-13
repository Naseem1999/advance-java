@FunctionalInterface 
interface A{
    // void show();
    void show(int i);
}

class Demo{
     public static void main(String[] args) {
    //   A obj=new A() {
    //     public void show(){
    //         System.out.println("In a show");
    //     }
    //   };
    //   A obj=() ->
    //     {
    //         System.out.println("In a show");
    //     };
      A obj=i ->System.out.println("In a show "+i);
        
      

      obj.show(3);
     }
}