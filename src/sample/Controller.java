package sample;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Optional;

public class Controller {

    public void pressButton(ActionEvent evt) {
        showAlertWithHeaderText();
    }
    public void pressButtonTim(ActionEvent evt) {showTimsText2();}

    private void showAlertWithHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nerd-Alert!");
        alert.setHeaderText("Wow - du hast auf meinen Button geklickt! ");
        alert.setContentText("Okay, ein Pop-Up - aber schaffst du vielleicht auch noch mehr? Wie wäre es mit einem Bild?!");
        alert.showAndWait();
    }
    private void showTimsText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error 404");
        alert.setHeaderText("Hier gibt es nichts zu sehen");
        alert.setContentText("Bitte gehen sie weiter");
        alert.showAndWait();
    }

    private void showTimsText2() {

        TextInputDialog dialog = new TextInputDialog("Hier eingeben");
        dialog.setTitle("Ich bin Batman!");
        dialog.setHeaderText("Ich suche nach einem Sidekick!");
        dialog.setContentText("Bitte gebe hier deinen Namen ein um dich als mein Sidekick zu bewerben:");
        dialog.setGraphic(new ImageView(this.getClass().getResource("Batman.jpg").toString()));
        Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("BatmanLogo.png").toString()));

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            String ausgabe = result.get();
            Alert alert2 = new Alert(Alert.AlertType.ERROR);
            alert2.setTitle("Error 404");
            alert2.setHeaderText("Der Name " + ausgabe + " ist leider bereits vergeben");
            alert2.setContentText("Bitte versuch es erneut");
            alert2.showAndWait();
        }
    }

}
