package com.test.myapplication.Presenter;

//import javax.inject.Inject;

import com.test.myapplication.MVPApplication;
import com.test.myapplication.Model.News;
import com.test.myapplication.View.MainView;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class MainPresenter extends Presenter<MainView> {

   // @Inject
   // public StringInteractor interactor;

    public MainPresenter(){
        //MVPApplication.injector.inject(this);
    }

    public void doStuff() {
        view.updateView( new News(1, 2, "bla", "bla", "bla")) ;
    }
}
