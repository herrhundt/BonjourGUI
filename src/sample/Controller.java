package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class Controller {

    public void pressButton(ActionEvent evt) {
        showAlertWithHeaderText();
    }
    public void pressButton1(ActionEvent evt) {
        showAlertWithHeaderText1();
    }

    private void showAlertWithHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nerd-Alert!");
        alert.setHeaderText("Wow - du hast auf meinen Button geklickt! ");
        alert.setContentText("Okay, ein Pop-Up - aber schaffst du vielleicht auch noch mehr? Wie wäre es mit einem Bild?!");
        alert.showAndWait();
    }
    private void showAlertWithHeaderText1() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("You got jebaited");
        alert.setHeaderText("Wow - du hast auf meinen Button geklickt! - selber schuld ");
        alert.setContentText("Okay, ein Pop-Up - aber schaffst du vielleicht auch noch mehr? Wie wäre es mit einem Bild?!");
        alert.showAndWait();
    }

}
