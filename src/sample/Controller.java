package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class Controller {

    public void pressButton(ActionEvent evt) {
        showAlertWithHeaderText();
    }

    private void showAlertWithHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nerd-Alert!");
        alert.setHeaderText("Wow - du hast auf meinen Button geklickt! ");
        alert.setContentText("Okay, ein Pop-Up - aber schaffst du vielleicht auch noch mehr? Wie wäre es mit einem Bild?!");
        alert.showAndWait();
    }

    public void pressButton6(ActionEvent evt){
        showAlertWithHeaderText6();
    }

    private void showAlertWithHeaderText6(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("lol");
        alert.setHeaderText("Funktioniert das?");
        alert.setContentText("ich hoffe es");
        alert.showAndWait();
    }
}
