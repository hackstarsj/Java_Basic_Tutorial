import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class JavaDateExample {
    public static void main(String args[]){
        System.out.println("Date Time Example : ");

        //current Data
        Date date=new Date();
        System.out.println("Data Timestamp : "+date.getTime());
        System.out.println("Date : "+date.toString());

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("HH:mm:ss");
        System.out.println("Date Only : "+simpleDateFormat.format(date));
        System.out.println("Time Only : "+simpleDateFormat1.format(date));
        System.out.println("Date Time Only : "+simpleDateFormat2.format(date));


        //Increase Day one Day
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,1);
        Date date1=calendar.getTime();

        System.out.println("New Date After 1 Day Added : "+simpleDateFormat2.format(date1));

        //Increase One Month
        Calendar calendar2=Calendar.getInstance();
        calendar2.setTime(date);
        calendar2.add(Calendar.MONTH,1);
        Date date2=calendar2.getTime();

        System.out.println("New Date After 1 Month Added : "+simpleDateFormat2.format(date2));

        //Increase One Year
        Calendar calendar3=Calendar.getInstance();
        calendar3.setTime(date);
        calendar3.add(Calendar.YEAR,1);
        Date date3=calendar3.getTime();

        System.out.println("New Date After 1 Year Added : "+simpleDateFormat2.format(date3));


        //Increase One Week
        Calendar calendar4=Calendar.getInstance();
        calendar4.setTime(date);
        calendar4.add(Calendar.WEEK_OF_MONTH,1);
        Date date4=calendar4.getTime();

        System.out.println("New Date After 1 Week Added : "+simpleDateFormat2.format(date4));


        //Decrease One Day
        Calendar calendar5=Calendar.getInstance();
        calendar5.setTime(date);
        calendar5.add(Calendar.DAY_OF_MONTH,-1);
        Date date5=calendar5.getTime();

        System.out.println("New Date Decrease 1 Day  : "+simpleDateFormat2.format(date5));

        String stringDate="2020-01-02";
        SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date6=simpleDateFormat3.parse(stringDate);
            System.out.println("String to Date : "+date6.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }


        LocalDate localDate=LocalDate.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("Date Only Another : "+localDate);
        System.out.println("Date Time Only Another : "+localDateTime);


    }
}
