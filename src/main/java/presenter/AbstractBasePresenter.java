package presenter;


import model.LabsHandler;
import view.AbstractView;

public abstract class AbstractBasePresenter<T extends AbstractView> implements Presenter<T> {
    protected T commonView;
    protected LabsHandler labsHandler;

    public AbstractBasePresenter(LabsHandler labsHandler) {
        this.labsHandler = labsHandler;
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
