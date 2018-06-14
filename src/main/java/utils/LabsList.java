package utils;

import view.CommonView;
import view.lab1.Lab1View;
import view.lab2.Lab2View;
import view.lab3.Lab3View;

import java.util.ArrayList;
import java.util.List;


public class LabsList {
    private static LabsList instance;
    private List<CommonView> commonViewList;

    private LabsList(List<CommonView> commonViewList) {
        this.commonViewList = commonViewList;
    }

    public static LabsList getInstance() {
        if (instance == null) {
            List<CommonView> commonViews = new ArrayList<>();
            commonViews.add(new Lab1View());
            commonViews.add(new Lab2View());
            commonViews.add(new Lab3View());
            instance = new LabsList(commonViews);
        }
        return instance;
    }

    public List<CommonView> getCommonViewList() {
        return commonViewList;
    }
}
