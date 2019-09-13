package main.domain;

import main.util.Formatting;

import java.util.Date;

import static main.util.Constants.HYPHEN;
import static main.util.Constants.MAX_DATE;

/**
 * @author Sergey Moroz
 * @since 13.09.2019
 */

public class QueryLine extends Line {

    private Date dateFrom;
    private Date dateTo;

    public QueryLine(int id, String serviceID, String questionType, String responseType, String responseDate) {
        super(id, serviceID, questionType, responseType);
        String[] date = responseDate.split(HYPHEN);
        this.dateFrom = Formatting.parseDate(date[0], id);
        this.dateTo = (date.length > 1) ? Formatting.parseDate(date[1], id) : MAX_DATE;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }
}
