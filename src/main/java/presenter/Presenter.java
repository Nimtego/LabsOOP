package presenter;


import view.AbstractView;

public interface Presenter<T extends AbstractView>{
    void attach(T commonView);
    void detach();
    void viewIsReady();
}
