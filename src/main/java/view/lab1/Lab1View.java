package view.lab1;

import presenter.Presenter;
import presenter.lab1.Lab1Presenter;
import view.AbstractView;

import static utils.Constant.DESCRIPTION_LAB_1;

/**
 * Created by nimtego_loc on 14.06.2018.
 */
public class Lab1View extends AbstractView{


    @Override
    public Presenter setPresenter() {
        return new Lab1Presenter();
    }


    @Override
    protected String setDescription() {
        return DESCRIPTION_LAB_1;
    }
}
