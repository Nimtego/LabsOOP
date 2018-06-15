package model;

import utils.LabsList;

import java.util.List;

import static utils.Constant.MAIN_MENU;

/**
 * Created by nimtego_loc on 16.06.2018.
 */
public class SimpleLabsHandler implements LabsHandler{

    private List<LabsModel> labs;
    private String header;
    private LabsModel current;

    public SimpleLabsHandler() {
        this.labs = LabsList.getInstance().getCommonViewList();
        this.header = MAIN_MENU;

    }

    @Override
    public List<LabsModel> getLabsModel() {
        return labs;
    }

    @Override
    public LabsModel getLabByNumber(int number) throws NumberFormatException{
        if (number > labs.size() || number < 0)
            throw new NumberFormatException();
        current = labs.get(number);
        return current;
    }


    @Override
    public LabsModel getCurrent() {
        return current;
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public void clear() {
        current = null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(header).append("\n");
        int count = 1;
        for (LabsModel lb: labs) {
            sb.append(count++).append(" ").append(lb.getHeader()).append("\n");
        }
        return String.valueOf(sb);
    }
}
