import java.util.Date;

public class Demo {
   public static void main(String[] args) {
     Date date=new Date();
     long time=date.getTime();
     System.out.println(time);

     java.sql.Date sdate=new  java.sql.Date(time);
     System.out.println(sdate);
   }

    
}

    