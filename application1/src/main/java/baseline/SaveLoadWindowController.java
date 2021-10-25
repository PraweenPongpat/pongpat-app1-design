/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SaveLoadWindowController {
    //this window can be called only from rootWindow!
    //ensure this doesn't get tangled with other scenes

    @FXML
    private TextField fileLocation;

    @FXML
    private TextField fileName;

    @FXML
    public List<String> cancelButtonPushed(ActionEvent event) throws IOException {
        //if cancelButton is pushed
        //return null

        //this block of code will change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rootWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

        return Collections.emptyList();
    }

    @FXML
    public List<String> finishButtonPushed(ActionEvent event) throws IOException {
        //if finishButton is pushed
        //create an empty list to store strings
        //read a string from TextField fileName
        //add the string to the list
        //read a string from TextField fileLocation
        //add the string to the list

        //if the filename is empty (length == 0)
        //      display the message error that the name cannot be emptied (though errorDisplayWindow.fxml)
        //      return null
        //if the filename is not empty
        //      return the list of string


        //this block of code will change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rootWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

        return Collections.emptyList();
    }
}
