package view;


import presenter.Presenter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractView implements CommonView{

    protected Presenter presenter;
    protected BufferedReader bf;
    protected String description;

    public AbstractView() {
        this.presenter = setPresenter();
        this.description = setDescription();
        this.presenter.attach(this);
        bf = new BufferedReader(new InputStreamReader(System.in));
    }

    public void destroy() {
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
    protected abstract String setDescription();

    public String getDescription() {
        return description;
    }

}
