/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class DisplayWindowController implements Initializable {

    private List<ItemsInATodoList> list;
    public void setList(List<ItemsInATodoList> list) {
        this.list = list;
    }
    public List<ItemsInATodoList> getList() {
        return list;
    }
    @FXML
    private Button doneButton;

    @FXML
    private TreeTableView<?> tableView;

    @FXML
    private TreeTableColumn<?, ?> taskDueDate;

    @FXML
    private TreeTableColumn<?, ?> taskInfo;

    @FXML
    private TreeTableColumn<?, ?> taskName;

    @FXML
    void doneButtonPushed(ActionEvent event) throws IOException {
        //when doneButton is push
        //simply move the scene back to the mainWindow.fxml scene

        //this block of code will change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initialize the scene with the information
        //      when show___Button is pushed, the list is passed in to set the information already
        //      the list made will contain either only "complete" status tasks or "incomplete" status tasks
        //initialize the tableView with the information in that list
    }
}
