package presenter.lab3;

import model.lab3.Lab3DaysModel;
import presenter.AbstractBasePresenter;

import java.io.IOException;

import static utils.Constant.WRONG_RESPONSE;

/**
 * Created by nimtego_loc on 15.06.2018.
 */
public class Lab3Presenter extends AbstractBasePresenter {

    public Lab3Presenter() {
        super(new Lab3DaysModel());
    }

    @Override
    public void viewIsReady() {
        commonView.request(labsModel.getData());
        String response = "";
        try {
            response = commonView.response();
            String dayMonth = ((Lab3DaysModel)labsModel).dayMonth(Integer.parseInt(response));
            commonView.request(dayMonth);
        } catch (IOException e) {
            commonView.request(WRONG_RESPONSE);
        }

    }
}
