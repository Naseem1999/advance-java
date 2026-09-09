//class-class ==>extends
//class-interface ==>implements
//interface-interface ==>extends

interface A{
    int age=10 ;  //every variable inside interface is final and static
    int area=23;
    void show();
    void config();
}
interface X {
    void run();
}
interface Y extends X{

}
class B implements A,Y{
   public void show(){
     System.out.println("In show");
   }
   public void config(){
     System.out.println("In config");
   }
   public void run(){
    System.out.println("Running.....");
   }
}
class Demo{
     public static void main(String[] args) {
       A obj;
       obj=new B();
       obj.show();
       obj.config();
       
       X obj1=new B();
       obj1.run();
    //    A.area=233;
       System.out.println(A.area);
     }
}