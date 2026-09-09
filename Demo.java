class A{
    public void show(){
        System.out.println("showing....");
    }

}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
class Demo{
     public static void main(String[] args) {
      
        // A obj=new B();
        A obj=new A()
        {//inner class anonomous classS
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();
     }
}