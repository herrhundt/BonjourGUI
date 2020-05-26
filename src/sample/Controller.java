package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Optional;

public class Controller {

    public Button btn3;

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

    public void pressNoahsButton(ActionEvent evt) {
        showNoahsAlertWindow();
    }

    private int rating1 = 0;
    private int rating2 = 0;
    private int imageID = 1;

    public void showNoahsAlertWindow() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Rate this image!");
        alert.setHeaderText("Like or dislike this image!\nYou can also view a new image! ");
        alert.setResizable(true);
        if (imageID == 1) {
            alert.setContentText("How the community rated this image:\n" + rating1);
        } else if (imageID == 2) {
            alert.setContentText("How the community rated this image:\n" + rating2);
        }

        if (imageID == 1) {
            Image image = new Image("https://www.telegraph.co.uk/content/dam/news/2018/01/26/TELEMMGLPICT000152421395_trans_NvBQzQNjv4BqpVlberWd9EgFPZtcLiMQfyf2A9a6I9YchsjMeADBa08.jpeg?imwidth=450");
            ImageView imageView = new ImageView(image);
            alert.setGraphic(imageView);
        } else if (imageID == 2) {
            Image image2 = new Image("https://gamepedia.cursecdn.com/minecraft_de_gamepedia/7/7c/Grasblock.png");
            ImageView imageView2 = new ImageView(image2);
            alert.setGraphic(imageView2);
        }

        ButtonType buttontype1 = new ButtonType("Like");
        ButtonType buttontype2 = new ButtonType("Dislike");
        ButtonType buttontype3 = new ButtonType("New image");
        ButtonType buttontype4 = new ButtonType("Cancel");
        alert.getButtonTypes().setAll(buttontype1, buttontype2, buttontype3, buttontype4);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttontype1) {
            if (imageID == 1) {
                rating1++;
            } else if (imageID == 2) {
                rating2++;
            }
            showNoahsAlertWindow();
        }
        if (result.get() == buttontype2) {
            if (imageID == 1) {
                rating1--;
            } else if (imageID == 2){
                rating2--;
            }
            showNoahsAlertWindow();
        }
        if (result.get() == buttontype3) {
            if (imageID == 1) {
                imageID = 2;
            } else if (imageID == 2){
                imageID = 1;
            }
            showNoahsAlertWindow();
        }
    }
}
