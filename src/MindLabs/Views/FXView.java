package MindLabs.Views;//
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Created by DaMasterHam on 21-11-2016.
//
public class FXView implements IView
{
    private Stage stage;
    protected Scene scene;
    protected Node node;

    public FXView(Stage stage)
    {
        this.stage = stage;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void render()
    {
        if (scene != null)
            stage.setScene(scene);
    }

}
