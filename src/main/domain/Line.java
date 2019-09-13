package main.domain;

/**
 * @author Sergey Moroz
 * @since 13.09.2019
 */

public abstract class Line {

    private int id;
    private String serviceID;
    private String questionType;
    private String responseType;

    public Line(int id, String serviceID, String questionType, String responseType) {
        this.id = id;
        this.serviceID = serviceID;
        this.questionType = questionType;
        this.responseType = responseType;
    }

    public int getId() {
        return id;
    }

    public String getServiceID() {
        return serviceID;
    }

    public String getQuestionType() {
        return questionType;
    }

    public String getResponseType() {
        return responseType;
    }

}
