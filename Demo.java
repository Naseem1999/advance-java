interface A{
    int age=10 ;  //every variable inside interface is final and static
    int area=23;
    void show();
    void config();
}
class B implements A{
   public void show(){
     System.out.println("In show");
   }
   public void config(){
     System.out.println("In config");
   }
}
class Demo{
     public static void main(String[] args) {
       A obj;
       obj=new B();
       obj.show();
       obj.config();
    //    A.area=233;
       System.out.println(A.area);
     }
}