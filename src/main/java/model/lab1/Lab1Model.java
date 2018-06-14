package model.lab1;

import model.AbstractModel;

import static utils.Constant.LAB_1_QUESTION;

public class Lab1Model extends AbstractModel {

    public Lab1Model() {
        super(LAB_1_QUESTION);
    }

    @Override
    public String getData() {
        return request;
    }
}
