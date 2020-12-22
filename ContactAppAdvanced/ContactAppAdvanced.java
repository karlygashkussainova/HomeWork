package ContactAppAdvanced;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactAppAdvanced extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("contactAppAdvanced.fxml"));
        primaryStage.setTitle("Contact App");
        primaryStage.setScene(new Scene(root, 600, 700));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

