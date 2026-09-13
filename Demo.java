@FunctionalInterface 
interface A{//lamda expression only works with functional interfaces
    // void show();
    // void show(int i);
    int add(int i,int j);
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
    //   A obj=i ->System.out.println("In a show "+i);
        
      

    //   obj.show(3);

    // A obj=new A() {
    //     public int add(int i,int j){
    //         return i+j;
    //     }
    // };
    A obj=(int i,int j)-> i+j;

    int res=obj.add(3,4);
    System.out.println(res);
     }
}