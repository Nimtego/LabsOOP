package model.lab3;

import model.AbstractModel;

import static utils.Constant.DESCRIPTION_LAB_3;
import static utils.Constant.LAB_3_QUESTION;

/**
 * Created by nimtego_loc on 15.06.2018.
 */
public class Lab3DaysModel extends AbstractModel {


    @Override
    protected String setHeader() {
        return DESCRIPTION_LAB_3;
    }

    @Override
    protected String setQuestion() {
        return LAB_3_QUESTION;
    }


    @Override
    public String solution(String dayOfYear) {
        int count = Integer.parseInt(dayOfYear);
        String dayAndMonth = null;
        for (MonthName m : MonthName.values()) {
            if (count - m.getDays() <= 0) {
                dayAndMonth = "Month - " +m +" Day " +(count - m.getDays() == 0 ? 1 : count);
                break;
            }
            count -= m.getDays();
        }
        return dayAndMonth;
    }
}
