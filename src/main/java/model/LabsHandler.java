package model;

import java.util.List;

/**
 * Created by nimtego_loc on 16.06.2018.
 */
public interface LabsHandler {
    List<LabsModel> getLabsModel();
    LabsModel getLabByNumber(int number);
    LabsModel getCurrent();
    String getHeader();
    void clear();
    void stCurrentLab(int number);
}
