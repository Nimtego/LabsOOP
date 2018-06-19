package presenter;

import model.LabsModel;
import model.SimpleLabsHandler;

import java.io.IOException;

import static utils.Constant.WRONG_RESPONSE;

/**
 * Created by nimtego_loc on 16.06.2018.
 */
public class LabPresenter extends AbstractBasePresenter {
    public LabPresenter() {
        super(new SimpleLabsHandler());
    }

    @Override
    public void viewIsReady() {
        String response = "";
        while (true) {
            commonView.request(labsHandler.toString());
            try {
                response = commonView.response();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (response.equals("Q") || response.equals("q"))
                break;
            try {
                int number = Integer.parseInt(response);
                labsHandler.getLabByNumber(number - 1);
            } catch (NumberFormatException e) {
                commonView.request(WRONG_RESPONSE);
                continue;
            }
            try {
                LabsModel labsModel = labsHandler.getCurrent();
                commonView.request(labsModel.getQuestion());
                response = commonView.response();
                commonView.request(labsModel.solution(response));
                labsHandler.clear();
            } catch (IOException e) {
                commonView.request(WRONG_RESPONSE);
            }
        }

    }
}

