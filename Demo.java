interface Computer{
    public abstract void Code();
}

class Laptop implements Computer{
    public void Code(){
        System.out.println("Code,compile and run...");
    }
}
class Desktop implements Computer{
    public void Code(){
        System.out.println("Code,compile and faster....");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.Code();
        System.out.println("Developing app.....");
    }
}
class Demo{
     public static void main(String[] args) {
        Computer lap =new Laptop();
        Computer desk=new Desktop();
       Developer dev=new Developer();
       dev.devApp(desk);
     }
}