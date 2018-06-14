package model;

import utils.LabsList;
import view.AbstractView;
import view.CommonView;

import java.util.List;

import static utils.Constant.MAIN_MENU;


public class LabsHandlerModel extends AbstractModel {


    public LabsHandlerModel() {
        super(MAIN_MENU);
    }

    @Override
    public String getData() {
        List<CommonView> listView = LabsList.getInstance().getCommonViewList();
        StringBuilder sb = new StringBuilder();
        sb.append(request).append("\n");
        for (int i = 0; i < listView.size(); i++) {
            sb.append(i+1).append(" ")
                    .append(((AbstractView)listView.get(i)).getDescription())
                    .append("\n");
        }
        return String.valueOf(sb);
    }
    public CommonView getLabByNumber(int number) {
        if (number > LabsList.getInstance().getCommonViewList().size() ||
                number < 0)
            return null;
        return LabsList.getInstance().getCommonViewList().get(number);
    }
}
