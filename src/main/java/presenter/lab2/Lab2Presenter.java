package presenter.lab2;

import model.lab2.Lab2Model;
import presenter.AbstractBasePresenter;

/**
 * Created by nimtego_loc on 15.06.2018.
 */
public class Lab2Presenter extends AbstractBasePresenter {

    public Lab2Presenter() {
        super(new Lab2Model());
    }

    @Override
    public void viewIsReady() {
        commonView.request(labsModel.getData());

    }
}
