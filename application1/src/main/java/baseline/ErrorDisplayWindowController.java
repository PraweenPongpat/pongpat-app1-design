package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ErrorDisplayWindowController implements Initializable {

    //this class will always be a new stage!*****************
    //that never return anything

    @FXML
    private Label messageLabel;

    @FXML
    private Button okButton;

    private String errorStatement;
    public void setErrorStatement(String errorStatement) {
        this.errorStatement = errorStatement;
    }
    public String getErrorStatement() {
        return errorStatement;
    }

    @FXML
    public void okButtonPushed(ActionEvent event) throws IOException {
        //when the okButton is pushed, return to the previous the scene
        //simply close out the stage
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //set the title of the stage to "error occurred"

        //before moving on to this scene, the error statement should already be passed
        //initialize the messageLabel from the errorStatement to let the user know that there's something wrong
    }
}
