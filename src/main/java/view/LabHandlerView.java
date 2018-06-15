package view;

import presenter.LabPresenter;
import presenter.Presenter;

/**
 * Created by nimtego_loc on 14.06.2018.
 */
public class LabHandlerView extends AbstractView {


    @Override
    public Presenter setPresenter() {
        return new LabPresenter();
    }
}
