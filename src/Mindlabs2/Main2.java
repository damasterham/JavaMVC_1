package Mindlabs2;//

import Mindlabs2.Views.FXView;
import Mindlabs2.Views.FXLoginView;
import javafx.application.Application;
import javafx.stage.Stage;

//Created by DaMasterHam on 21-11-2016.
//
public class Main2 extends Application
{
    private Stage stage;

    // Controllers
    private LoginController login;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        stage = primaryStage;

        // initialized FXView parent with stage
        FXView.setStage(stage);

        // Initialize controllers
        login = new LoginController(new FXLoginView());

        stage.show();

        //Loop?
    }


}
