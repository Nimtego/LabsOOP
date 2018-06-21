package utils;

import model.LabsModel;
import model.lab1.Lab1Model;
import model.lab2.Lab2Model;
import model.lab3.Lab3DaysModel;
import model.lab4.Lab4ModelArithmetic;
import model.lab5.Lab5ReadingFromFile;
import model.lab6.Lab6BankAccount;

import java.util.ArrayList;
import java.util.List;


public class LabsList {
    private static LabsList instance;
    private List<LabsModel> commonViewList;

    private LabsList(List<LabsModel> commonViewList) {
        this.commonViewList = commonViewList;
    }

    public static LabsList getInstance() {
        if (instance == null) {
            List<LabsModel> commonViews = new ArrayList<>();
            commonViews.add(new Lab1Model());
            commonViews.add(new Lab2Model());
            commonViews.add(new Lab3DaysModel());
            commonViews.add(new Lab4ModelArithmetic());
            commonViews.add(new Lab5ReadingFromFile("src\\main\\java\\utils\\test.txt"));
            commonViews.add(new Lab6BankAccount());
            instance = new LabsList(commonViews);
        }
        return instance;
    }

    public List<LabsModel> getCommonViewList() {
        return commonViewList;
    }
}
