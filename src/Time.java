import java.text.SimpleDateFormat;
import java.util.Date;



public class Time {
/* more info on how to get Real Time and date with java
this link has all the parameters  for the dateFormat and how to use them
https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
down here is the few example that we can use
 */
    public  void currentTime() {
        //here we get the time h means hour two will put it in 00:00 hours format and mm means minutes and a for am or pm(both will work)
        Date satTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mma");
        String time = dateFormat.format(satTime);
        System.out.println(time);
    }

    public  void currentDate() {
        //here we get the date for month we use MM because mm is minutes more info about the format check the link provided
        Date satDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        /*String date is key value here we can use it to store the output you need instead of doing it like this
         System.out.println(dateFormat.format(satDate));
         */
        //do this instead 
        String date = dateFormat.format(satDate);
        System.out.println(date);
        //now you can use this string over and over to get the result

    }
    public  void fullDate() {
        /*here we get all in one String spaces or anything that is not in the expected format will be printed as it is
        such as : for separating time / for separating date values you can use any of your choice
         */
        Date set = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy hh:mma");
        String dateAndTime = dateFormat.format(set);
        System.out.println(dateAndTime);
        //create main method and get this values to see the results
    }
}
