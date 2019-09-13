package main.domain;

import main.util.Formatting;

import java.util.Date;

/**
 * @author Sergey Moroz
 * @since 13.09.2019
 */

public class TimeLine extends Line {

    private Date responseDate;
    private int waitingTime;

    public TimeLine(int id, String serviceID, String questionType, String responseType, String responseDate, String waitingTime) {
        super(id, serviceID, questionType, responseType);
        this.responseDate = Formatting.parseDate(responseDate, id);
        this.waitingTime = Integer.parseInt(waitingTime);
    }

    public boolean isMatch(QueryLine queryLine) {
        if (queryLine == null) {
            return false;
        }

        String service = Formatting.toPattern(queryLine.getServiceID());
        String question = Formatting.toPattern(queryLine.getQuestionType());
        String response = queryLine.getResponseType();
        Date from = queryLine.getDateFrom();
        Date to = queryLine.getDateTo();

        return getServiceID().matches(service) &&
                getQuestionType().matches(question) &&
                getResponseType().equals(response) &&
                getResponseDate().compareTo(from) >= 0 &&
                getResponseDate().compareTo(to) < 0;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

}
