package sample;
//Sean McDonough, RIOT API access. Desktop OP.GG.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static javafx.stage.StageStyle.UNDECORATED;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent PlayerHome = FXMLLoader.load(getClass().getResource("PlayerHome.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(PlayerHome));
        primaryStage.initStyle(UNDECORATED);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
