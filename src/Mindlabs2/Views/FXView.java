package Mindlabs2.Views;//

import MindLabs.Views.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Created by DaMasterHam on 21-11-2016.
//
public class FXView implements IView
{
    private static Stage stg;
    public static void setStage(Stage stage)
    {
        stg = stage;
    }


    private Scene scene;


    public void setScene(Scene scene)
    {
        this.scene = scene;
    }

    @Override
    public void render()
    {
        if (stg != null && scene != null)
            stg.setScene(scene);
    }
}
