// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<=100;i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }
class B implements Runnable{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class Demo{
    
     public static void main(String[] args) {
    //   A obj1=new A();
    //   B obj2=new B();

        // Runnable obj1=new A();
        // Runnable obj2=new B();
        Runnable obj1=() ->{
        for(int i=0;i<=10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
         };

         Runnable obj2=() ->{
        for(int i=0;i<=10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
         };
        
    //   System.out.println(obj1.getPriority());
    // obj2.setPriority(Thread.MAX_PRIORITY);
    //   obj1.start();
    //   try {
    //       Thread.sleep(2);
    //      } catch (InterruptedException e) {e.printStackTrace();}
    //   obj2.start();

    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);

    t1.start();
    t2.start();


     }
}