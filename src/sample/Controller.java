package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;

public class Controller {

    public void pressButton(ActionEvent evt) {
        adrianButton();
    }
    public void pressButtonAdrian(ActionEvent evt) {
        showAlertWithHeaderText();
    }

    private void showAlertWithHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nerd-Alert!");
        alert.setHeaderText("Wow - du hast auf meinen Button geklickt! ");
        alert.setContentText("Okay, ein Pop-Up - aber schaffst du vielleicht auch noch mehr? Wie wäre es mit einem Bild?!");
        alert.showAndWait();
    }

    private void adrianButton() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nerd-Alert!");
        alert.setHeaderText("Lmao your pc be off now");
        alert.setContentText("Yeeeeeeeeeeeeeeeee get baited Yeeeeeeeeee get baited Yeeeeeeeeeeee");
        alert.showAndWait();
        try{shutdown();}
        catch(IOException E){}
    }

    //Ignore this this is my special tool from stacks exchange
    public static void shutdown() throws RuntimeException, IOException, IOException {
        String shutdownCommand;
        String operatingSystem = System.getProperty("os.name");

        if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
            shutdownCommand = "shutdown -h now";
        }
        else if ("Windows".equals(operatingSystem)) {
            shutdownCommand = "shutdown.exe -s -t 0";
        }
        else {
            throw new RuntimeException("Unsupported operating system.");
        }

        Runtime.getRuntime().exec(shutdownCommand);
        System.exit(0);
    }
}
