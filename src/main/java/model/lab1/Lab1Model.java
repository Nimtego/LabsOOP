package model.lab1;

import model.AbstractModel;

import static utils.Constant.DESCRIPTION_LAB_1;
import static utils.Constant.GREETING;
import static utils.Constant.LAB_1_QUESTION;

public class Lab1Model extends AbstractModel {

    @Override
    protected String setHeader() {
        return DESCRIPTION_LAB_1;
    }

    @Override
    protected String setQuestion() {
        return LAB_1_QUESTION;
    }

    @Override
    public String solution(String request) {
        return GREETING +request;
    }
}
