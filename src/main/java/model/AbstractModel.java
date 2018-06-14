package model;

/**
 * Created by nimtego_loc on 14.06.2018.
 */
public abstract class AbstractModel implements LabsModel {
    protected String request;

    public AbstractModel(String request) {
        this.request = request;
    }
}
