package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.net.URI;
import java.util.Optional;


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



        /* Hyperlink link = new Hyperlink();
        link.setText("http://example.com");
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //hyperlink.setOnAction(Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ")));
            }
        }); */

        //Hyperlink hyperlink = new Hyperlink("https://www.youtube.com/watch?v=dQw4w9WgXcQ");



        //alert.setHeaderText("http://example.com");




    }


