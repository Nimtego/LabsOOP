package presenter;

import model.LabsHandlerModel;
import view.CommonView;

import java.io.IOException;

import static utils.Constant.WRONG_NUMBER;
import static utils.Constant.WRONG_RESPONSE;

/**
 * Created by nimtego_loc on 14.06.2018.
 */
public class LabHandlerPresenter extends AbstractBasePresenter {

    public LabHandlerPresenter() {
        super(new LabsHandlerModel());
    }

    @Override
    public void viewIsReady() {
        commonView.request(labsModel.getData());
        String response = "";
        try {
            response = commonView.response();
            int number = Integer.parseInt(response);
            startLab(number - 1);
        } catch (IOException e) {
            commonView.request(WRONG_RESPONSE);
        }

    }

    private void startLab(int number) {
        CommonView cv = ((LabsHandlerModel) labsModel).getLabByNumber(number);
        if (cv == null) {
            commonView.request(WRONG_NUMBER);
            viewIsReady();
        }
        cv.run();
    }
}