package MindLabs;

import MindLabs.Views.IView;
import MindLabs.Views.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

//Amazing fx application!!!!
public class Main extends Application
{
    static private Map<String, IView> viewMap;
    private Stage stage;
    private LoginController loginController;

    @Override
    public void start(Stage stage) throws Exception
    {
        this.stage = stage;

        initialize();

        String viewName = loginController.indexView();

        render(viewName);

        //Parent root = FXMLLoader.load(getClass().getResource("MindLabs.fxml"));
        stage.setTitle("Hello World");
        stage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }

    private void initialize()
    {
        viewMap = new HashMap<String, IView>();
        viewMap.put("FXLoginView", new LoginView(stage));

        viewMap.get("FXLoginView").render();
    }

    public void render(String viewName)
    {
        viewMap.get(viewName).render();
    }


}
