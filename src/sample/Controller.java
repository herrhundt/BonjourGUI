package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class Controller {

    public void pressButton(ActionEvent evt) {
        showAlertWithHeaderText();
    }

    private void showAlertWithHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hinweis");
        alert.setHeaderText("Dies ist ein Hinweis");
        alert.setContentText("Hallo Herr Hundt!");
        alert.showAndWait();
    }
}
