class A{
    int a;
    public void show(){
        System.out.println("showing....");
    }
    static  class B{  //there should be only inner class static ho sakti baki outer class ko static nahi bana saktay
        public void config(){
            System.out.println("config......");
        }
    }
}
class Demo{
     public static void main(String[] args) {
       A obj=new A();
       obj.show();

    //    A.B obj1=obj.new B();
       A.B obj1=new A.B();
       obj1.config();
       
     }
}