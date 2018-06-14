package view;


import presenter.Presenter;

import java.io.IOException;

public interface CommonView {
    void run();
    Presenter setPresenter();
    void destroy();
    void request(String message);
    String response() throws IOException;
}
