package basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateInString {

    public static void main(String[] args) throws ParseException {


        //no1 Converted "06-07-2013" date into String Format "Fri, Jun 7 2013"
        String dateInString = "06-07-2013";
        DateFormat formattter = new SimpleDateFormat("MM-dd-yyyy");
        Date date = formattter.parse(dateInString);
        SimpleDateFormat datetoString = new SimpleDateFormat("EEE, MMMM d yyyy");
        System.out.println("Converted String: " + datetoString.format(date));



        //no 2 Converted "06-07-2013" date into String Format "Friday, June 7 2013, 12:10:56 PM"
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEEE, MMM d yyyy, HH:mm:ss a");
        Calendar calendar = new GregorianCalendar(2013, 05, 7, 12, 10, 56);
        System.out.println("Converted String: " + sdf.format(calendar.getTime()));

    }

}