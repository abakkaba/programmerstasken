package main.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static main.util.Constants.DATE_FORMAT;

/**
 * @author Sergey Moroz
 * @since 13.09.2019
 */

public class Formatting {

    private Formatting() {
        // @comment: implementation not needed
    }

    public static Date parseDate(String date, int id) {
        Date result = null;
        try {
            result = new SimpleDateFormat(DATE_FORMAT).parse(date);
        } catch (ParseException e) {
            System.out.printf("Date is not well formatted in line %s", id);
        }
        return result;
    }
}
