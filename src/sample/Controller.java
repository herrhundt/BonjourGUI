package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

    public void pressNicosButton(ActionEvent evt) {
        showAlertWithHeaderText2();
    }

    private void showAlertWithHeaderText2() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Hey folks!");
        alert.setHeaderText("Hier süßes Bild, cause why not... ");
        Image image = new Image("https://i.pinimg.com/originals/df/d1/f3/dfd1f3d09b2b2004747e6fb9fb940dd7.png");
        ImageView imageView = new ImageView(image);
        alert.setGraphic(imageView);
        alert.showAndWait();
    }
}