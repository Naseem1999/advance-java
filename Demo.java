enum Status{
    Running,Failed,Pending,Success;
}
class Demo{
     public static void main(String[] args) {
      int i=5;
    //   Status s=Status.Running;
      Status s[]=Status.values();

      for(Status s1 :s)
      System.out.println(s1 +": "+s1.ordinal());
     }
}