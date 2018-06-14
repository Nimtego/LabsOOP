package presenter.lab1;

import model.lab1.Lab1Model;
import presenter.AbstractBasePresenter;

import java.io.IOException;

import static utils.Constant.GREETING;
import static utils.Constant.WRONG_RESPONSE;


public class Lab1Presenter extends AbstractBasePresenter{

    public Lab1Presenter() {
        super(new Lab1Model());
    }

    @Override
    public void viewIsReady() {
        commonView.request(labsModel.getData());
        String response = "";
        try {
            response = commonView.response();
            commonView.request(GREETING +response);
        } catch (IOException e) {
            commonView.request(WRONG_RESPONSE);
        }

    }
}
