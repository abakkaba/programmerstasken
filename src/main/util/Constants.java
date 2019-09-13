package main.util;

import java.util.Date;

/**
 * @author Sergey Moroz
 * @since 13.09.2019
 */

public class Constants {

    public static final String HYPHEN = "-";
    public static final Date MAX_DATE = new Date(Long.MAX_VALUE);

    static final int LINE_TYPE = 0;
    static final int SERVICE_ID = 1;
    static final int QUESTION_TYPE = 2;
    static final int RESPONSE_TYPE = 3;
    static final int RESPONSE_DATE = 4;
    static final int WAITING_TIME = 5;

    static final String SPACE = " ";
    static final String ASTERISK = "*";
    static final String MATCH_ANY = ".*";
    static final String DATE_FORMAT = "dd.MM.yyyy";
    static final String TIME_LINE = "C";
    static final String QUERY_LINE = "D";

    private Constants() {
        // @comment: implementation not needed
    }
}
