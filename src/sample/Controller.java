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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.net.URI;
import java.util.Optional;


public class Controller {

    public void pressButton(ActionEvent evt) {        showAlertWithHeaderText();    }
    public void pressButton1 (ActionEvent evt) {     showAlertWithHeaderText1();    }
    public void pressNicosButton(ActionEvent evt) {        showAlertWithHeaderText2();    }
    public void pressButtonTim(ActionEvent evt) {showTimsText2();}

    private void showAlertWithHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nerd-Alert!");
        alert.setHeaderText("Wow - du hast auf meinen Button geklickt! ");
        alert.setContentText("Okay, ein Pop-Up - aber schaffst du vielleicht auch noch mehr? Wie wäre es mit einem Bild?!");
        alert.showAndWait();
    }
    private void showAlertWithHeaderText1() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Was ist denn hier los?");
        Image image = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Pfeil_rechts_unten.svg/768px-Pfeil_rechts_unten.svg.png");
        ImageView imageView = new ImageView(image);
        alert.setGraphic(imageView);
        alert.setHeaderText("Will mir der Pfeil etwas sagen?");
        alert.setContentText("Was hat das zu bedeuten und warum ist der Pfeil so groß? Erfahre es dort drüben -->");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent()) {
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ")) ;
            }

            catch(Exception e){
                alert.close();
            }
        }

        alert.showAndWait();
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
            alert2.setHeaderText("Ich habe bereits einen Sidekick namens " + ausgabe);
            alert2.setContentText("Bitte versuch es erneut");
            alert2.showAndWait();
        }
    }

}
