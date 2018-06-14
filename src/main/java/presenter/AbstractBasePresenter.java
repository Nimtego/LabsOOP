package presenter;


import model.LabsModel;
import view.AbstractView;

public abstract class AbstractBasePresenter<T extends AbstractView> implements Presenter<T> {
    protected T commonView;
    protected LabsModel labsModel;

    public AbstractBasePresenter(LabsModel labsModel) {
        this.labsModel = labsModel;
    }

    @Override
    public void attach(T commonView) {
        this.commonView = commonView;
    }

    @Override
    public void detach() {
        commonView = null;
    }
}
