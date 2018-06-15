package model.lab2;

import model.AbstractModel;

import static utils.Constant.DESCRIPTION_LAB_2;
import static utils.Constant.LAB_2_QUESTION;

/**
 * Created by nimtego_loc on 15.06.2018.
 */
public class Lab2Model extends AbstractModel {


    @Override
    protected String setHeader() {
        return DESCRIPTION_LAB_2;
    }

    @Override
    protected String setQuestion() {
        return LAB_2_QUESTION;
    }

    @Override
    public String solution(String request) {
        AccountType g = AccountType.CHECKING;
        AccountType p = AccountType.DEPOSIT;
        StringBuilder sb = new StringBuilder();
        sb.append("AccountType g is ").append(g).append(" AccountType p is ").append(p);
        return String.valueOf(sb);
    }
}
