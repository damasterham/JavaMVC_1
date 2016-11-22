package MindLabs.Views;//

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//Created by DaMasterHam on 21-11-2016.
//
public class LoginView extends FXView
{
    public LoginView(Stage stage)
    {
        super(stage);

// What we actually are making
        Pane bp = new Pane();
        bp.getChildren().add(new Button("Button"));
//

        scene = new Scene(bp, 800,600);
    }


}
