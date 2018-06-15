package view;


import presenter.Presenter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractView implements CommonView{

    protected Presenter presenter;
    protected BufferedReader bf;

    public AbstractView() {
        this.presenter = setPresenter();
        this.presenter.attach(this);
        bf = new BufferedReader(new InputStreamReader(System.in));
    }

    public void destroy() {
        bf = null;
        presenter.detach();
    }
    public final void run() {
        presenter.viewIsReady();
    }
    @Override
    public void request(String message) {
        System.out.println(message);
    }

    @Override
    public String response() throws IOException {
        return bf.readLine();
    }
}
