package tools;

import java.sql.Date;

public class Tools {
    public static Date insertDate(int year, int month, int day){
        return new Date(year-1900, month-1, day);
    }
}
