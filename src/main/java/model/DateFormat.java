package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public  Date getDate(String datePattern,String date) throws ParseException {
        return new SimpleDateFormat(datePattern).parse(date);
    }
}
