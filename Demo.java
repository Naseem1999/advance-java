@FunctionalInterface 
interface A{
    void show();
}
// class B implements A{
//     public void show(){
//         System.out.println("In a show");
//     }
// }
class Demo{
     public static void main(String[] args) {
      A obj=new A() {
        public void show(){
            System.out.println("In a show");
        }
      };

      obj.show();
     }
}