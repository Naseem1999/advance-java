abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class WagonR extends Car{
   public void drive(){
    System.out.println("Driving......");
   }
   
}

class UpdatedWagonR extends WagonR{  //concrete class

    
    public void fly() {
       System.out.println("WagonR is flying");
    }
    
}
class Demo{
     public static void main(String[] args) {
        Car car=new UpdatedWagonR();
        car.drive();
        car.playMusic();
        car.fly();
     }
}