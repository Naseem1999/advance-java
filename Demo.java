import java.time.*;

public class Demo {
   public static void main(String[] args) {
    //  Date date=new Date();
    //  long time=date.getTime();
    //  System.out.println(time);

    //  java.sql.Date sdate=new  java.sql.Date(time);
    //  System.out.println(sdate);

    LocalDate date=LocalDate.now();
    LocalTime localTime=LocalTime.now();

    int dayOfMonth=date.getDayOfMonth();
    System.out.println(dayOfMonth);

    int dayOfYear=date.getDayOfYear();
    System.out.println(dayOfYear);
    
    int month=date.getMonthValue();
    int year=date.getYear();


    System.out.println(dayOfMonth+ " / " +month+ " / " +year);


    System.out.println(date);
    System.out.println(localTime);
   }

    
}

    