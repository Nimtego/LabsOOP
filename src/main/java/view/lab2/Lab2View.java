package view.lab2;

import presenter.Presenter;
import presenter.lab2.Lab2Presenter;
import view.AbstractView;

import static utils.Constant.DESCRIPTION_LAB_2;

/**
 * Created by nimtego_loc on 14.06.2018.
 */
public class Lab2View extends AbstractView {

    @Override
    public Presenter setPresenter() {
        return new Lab2Presenter();
    }


    @Override
    protected String setDescription() {
        return DESCRIPTION_LAB_2;
    }
}
