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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainListWindowController implements Initializable {

    @FXML
    private Button addNewTaskButton;
    @FXML
    private Button backToMainPageButton;
    @FXML
    private Button editTaskButton;
    @FXML
    private Button makeTaskCompleteButton;
    @FXML
    private Button makeTaskIncompleteButton;
    @FXML
    private Button removeTaskButton;
    @FXML
    private Button showTaskCompleteButton;
    @FXML
    private Button showTaskIncompleteButton;
    @FXML
    private TreeTableColumn<?, ?> taskDueDate;
    @FXML
    private TreeTableColumn<?, ?> taskInfo;
    @FXML
    private TreeTableColumn<?, ?> taskName;
    @FXML
    private TreeTableColumn<?, ?> taskStatus;
    @FXML
    private TreeTableView<?> tableView;

    //this list will contain object of ItemsInATodoList
    private static List<ItemsInATodoList> listOfItems;
    public static void setListOfItems(List<ItemsInATodoList> listOfItems) {
        MainListWindowController.listOfItems = listOfItems;
    }
    public static List<ItemsInATodoList> getListOfItems() {
        return listOfItems;
    }

    @FXML
    public ItemsInATodoList addNewTaskButtonPushed(ActionEvent event) throws IOException {
        //launch a new (empty) editWindow.fxml
        //user should enter information in that window
        //if user click addToListButton
        //  it will return an ItemsInATodoList object with information in it
        //  add that object to the 'listOfItems'
        //if user click cancelButton
        //  it will return as a null object, do nothing in this case


        //this block of code may change***********************############################
        //only to change scene to add a todoList
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("editWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

        return null;
    }

    @FXML
    private List<ItemsInATodoList> backToMainPageButtonPushed(ActionEvent event) throws IOException {
        //simply change the scene to rootWindow returning the changed information to the main page

        //this block of code may change***********************############################
        //only to change scene to main root scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rootWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

        return Collections.emptyList();
    }

    @FXML
    public ItemsInATodoList editTaskButtonPushed(ActionEvent event) throws IOException {
        //for a selected task
        //read a selected ItemsInATodoList object in the list and store it to a new object
        //launch an editWindow.fxml
        //pass the newly made object to editWindowController class to compute using set method for the class
        //user should be able to edit information in that scene (it will be init with passed in strings)
        //if user click doneButton
        //  it will return an ItemsInATodoList object with information in it
        //  remove the original object from the list
        //  add that object to the 'listOfItems'
        //if user click cancelButton
        //  it will return as a null object, do nothing in this case

        //this block of code may change***********************############################
        //only to change scene to edit a todoList
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("editWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

        return null;
    }

    @FXML
    void makeTaskCompleteButtonPushed(ActionEvent event) {
        //read the index of the selected items of the list
        //access the object from that index list->get->setStatus function
        //set a new status of that index to "complete"
    }

    @FXML
    void makeTaskIncompleteButtonPushed(ActionEvent event) {
        //read the index of the selected items of the list
        //access the object from that index list->get->setStatus function
        //set a new status of that index to "incomplete"
    }

    @FXML
    void removeTaskButtonPushed(ActionEvent event) {
        //read the index of the selected items of the list
        //remove the object from the list using list->remove
    }

    @FXML
    void showTaskCompleteButtonPushed(ActionEvent event) throws IOException {
        //create a new list of objects
        //loop through the static list of this class
        //  if the element has status shown "complete"
        //      add the element to the new list
        //  otherwise, do nothing to that element
        //pass the list that only contains complete tasks to DisplayWindowController class
        //launch another scene to displayWindow.fxml
        //  (in that display should display the list)

        //this block of code may change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("displayWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();
    }

    @FXML
    void showTaskIncompleteButtonPushed(ActionEvent event) throws IOException {
        //create a new list of objects
        //loop through the static list of this class
        //  if the element has status shown "incomplete"
        //      add the element to the new list
        //  otherwise, do nothing to that element
        //pass the list that only contains incomplete tasks to DisplayWindowController class
        //launch another scene to displayWindow.fxml
        //  (in that display should display the list)

        //this block of code may change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("displayWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //always initialize the tableView with the current information contained in the list
        //each roll represents each object ItemInATodoList
        //  taskTitle, taskDueDate, taskInfo, taskStatus
        //if there's any adjustment in the list, the set method must be called to made new adjustment
        //before moving into this scene
    }
}
