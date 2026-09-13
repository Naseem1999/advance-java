enum Status{  //status By default exteneds from ENUM CLASS
    Running,Failed,Pending,Success;
}

enum Laptop{
    MacBook(2000),Xps(2100),Surface,Hp(3230);

    private int price;
    
    private Laptop() {
        price=500;
    }
    private  Laptop(int price){
          this.price=price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
class Demo{
     public static void main(String[] args) {
    //   int i=5;
    //   Status s=Status.Running;
    //   Status s[]=Status.values();

    //   for(Status s1 :s)
    //   System.out.println(s1 +": "+s1.ordinal());

    //   Status s=Status.Running;
    //   System.out.println(s.getClass().getSuperclass());

    //   switch (s) {
    //     case Running:
    //         System.out.println("All Good");
    //         break;
    //     case Failed:
    //     System.out.println("Try Again");
    //         break;
    //     case Pending:
    //     System.out.println("Please Wait");
    //         break; 
    //     default:
    //         System.out.println("Done");
    //         break;
    //   }


    //   if(s==Status.Running)
    //     System.out.println("All Good");
    //   if(s==Status.Failed)
    //     System.out.println("Try Again");
    //   if(s==Status.Pending)
    //     System.out.println("Please Wait");
    //   else
    //     System.out.println("Done");

    for(Laptop l :Laptop.values())
        System.out.println(l +" : " + l.getPrice());
     }
}