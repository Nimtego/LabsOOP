package view.lab3;

import presenter.Presenter;
import presenter.lab3.Lab3Presenter;
import view.AbstractView;

import static utils.Constant.DESCRIPTION_LAB_3;

/**
 * Created by nimtego_loc on 15.06.2018.
 */
public class Lab3View extends AbstractView {
    @Override
    public Presenter setPresenter() {
        return new Lab3Presenter();
    }

    @Override
    protected String setDescription() {
        return DESCRIPTION_LAB_3;
    }
}
