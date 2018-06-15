package model.lab4;

import model.AbstractModel;

import static utils.Constant.LAB_4_QUESTION;

/**
 * Created by nimtego_loc on 15.06.2018.
 */
public class Lab4ModelArithmetic extends AbstractModel {

    public Lab4ModelArithmetic() {
        super(LAB_4_QUESTION);
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
