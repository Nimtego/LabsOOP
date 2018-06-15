package model.lab4;

import model.AbstractModel;

import static utils.Constant.DESCRIPTION_LAB_4;
import static utils.Constant.LAB_4_QUESTION;

/**
 * Created by nimtego_loc on 15.06.2018.
 */
public class Lab4ModelArithmetic extends AbstractModel {


    @Override
    protected String setHeader() {
        return DESCRIPTION_LAB_4;
    }

    @Override
    protected String setQuestion() {
        return LAB_4_QUESTION;
    }

    @Override
    public String solution(String request) {
        int number = Integer.parseInt(request);
        return String.valueOf(factorial(number));
    }

    private int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
