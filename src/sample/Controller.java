package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.net.URI;


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
        Image image = new Image("https://i.ytimg.com/vi/dQw4w9WgXcQ/maxresdefault.jpg");
        ImageView imageView = new ImageView(image);
        alert.setGraphic(imageView);

        Hyperlink link = new Hyperlink();
        link.setText("http://example.com");
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //hyperlink.setOnAction(Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ")));
            }
        });

        //Hyperlink hyperlink = new Hyperlink("https://www.youtube.com/watch?v=dQw4w9WgXcQ");

        alert.getButtonTypes();

        alert.setHeaderText("http://example.com");



        alert.showAndWait();
    }

}
