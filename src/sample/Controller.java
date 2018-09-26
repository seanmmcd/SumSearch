package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class Controller {
        @FXML
        private void closeApplication() {
            Platform.exit();
        }
}
