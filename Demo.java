
class A{
    // public void show(){
    //     try{
    //      Class.forName("Calc");
    //     }catch(ClassNotFoundException e){
    //        System.out.println("Not able to find class");
    //     }
    // }
    public void show() throws ClassNotFoundException{
         Class.forName("Calc");
      
    }
}
class Demo{
    static {
        System.out.println("class loaded");
    }
     public static void main(String[] args) {
        
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
          
        }
     }
}