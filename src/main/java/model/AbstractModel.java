package model;

/**
 * Created by nimtego_loc on 14.06.2018.
 */
public abstract class AbstractModel implements LabsModel {
    private String header;
    private String question;

    public AbstractModel() {
        header = setHeader();
        question = setQuestion();
    }

    protected abstract String setHeader();


    protected abstract String setQuestion();

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public String getQuestion() {
        return question;
    }
}
