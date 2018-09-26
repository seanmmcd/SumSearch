package sample;
//Sean McDonough, RIOT API access. Desktop OP.GG.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent PlayerHome = FXMLLoader.load(getClass().getResource("PlayerHome.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(PlayerHome));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
