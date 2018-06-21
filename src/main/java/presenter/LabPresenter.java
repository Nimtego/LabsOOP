package presenter;

import model.LabsModel;
import model.SimpleLabsHandler;
import model.lab6.Lab6BankAccount;

import java.io.IOException;

import static utils.Constant.*;

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

                if (labsHandler.getCurrent() instanceof Lab6BankAccount) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(commonView.response()).append(FLAG);
                    ((Lab6BankAccount) labsHandler.getCurrent()).setQuestion(LAB_6_QUESTION_2);
                    commonView.request(labsModel.getQuestion());
                    sb.append(commonView.response());
                    response = String.valueOf(sb);
                    ((Lab6BankAccount) labsHandler.getCurrent()).setQuestion(LAB_6_QUESTION_1);
                }
                else
                    response = commonView.response();

                commonView.request(labsModel.solution(response));
                labsHandler.clear();
            } catch (IOException | NumberFormatException e ) {
                commonView.request(WRONG_RESPONSE +" - " +e.getMessage());
            }
        }

    }
}

