package model;

/**
 * Created by nimtego_loc on 14.06.2018.
 */
public abstract class AbstractModel implements LabsModel {
    protected String header;

    public AbstractModel(String request) {
        this.header = request;
    }

    @Override
    public String getHeader() {
        return header;
    }
}
