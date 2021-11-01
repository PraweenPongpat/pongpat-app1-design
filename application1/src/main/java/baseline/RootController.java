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
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private Button addToList;
    @FXML
    private Button delFromList;
    @FXML
    private Button editAList;
    @FXML
    private Button loadFromFile;
    @FXML
    private TreeTableColumn<?, ?> nameOfList;
    @FXML
    private Button safeToFile;
    @FXML
    private TextField titleOfList;

    //instance variables
    //a map having a key as name of a todoList, value is a list of the object contains info in that list
    //ensure that there will only be one map that can access from all function only within this class
    private static Map<String, List<ItemsInATodoList>> mapOfTodoList;
    public static void setMapOfTodoList(Map<String, List<ItemsInATodoList>> mapOfTodoList) {
        RootController.mapOfTodoList = mapOfTodoList;
    }
    public static Map<String, List<ItemsInATodoList>> getMapOfTodoList() {
        return mapOfTodoList;
    }

    @FXML
    public void addToListButtonPushed(ActionEvent event) {
        //read a text from TextFiled titleOfList
        //verified that the length is 3 or longer
        //if so and the key doesn't exist:
        //      put that title as a new key to the map, value is an empty list
        //if not or the key already existed:
        //      display error message through errorDisplayWindow.fxml
    }

    @FXML
    public void delFromListButtonPushed(ActionEvent event) {
        //read as list String from key of selected item(s) from the tableView (only one column)
        //iterate through the list of String
        //      remove each key from the map
    }

    @FXML
    public void editAListButtonPushed(ActionEvent event) throws IOException {
        //one object MUST be selected at a time, otherwise, display the message (though errorDisplayWindow.fxml)
        //change scene from the current scene to an existing todoList (mainWindow.fxml)

        //this block of code may change***********************############################
        //only to change scene to edit a todoList
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();
    }

    @FXML
    public void loadFromFileButtonPushed(ActionEvent event) throws IOException {
        //to load a file is only one-by-one loading
        //launch another scene (saveLoadWindow.fxml) to ask for the file name and location
        //make a Scanner, link to the file name
        //access the file using try-catch
        //if the file cannot be found, display the error message (though errorDisplayWindow.fxml)
        //if the file access shows no error...
        //read one line at a time
        //*****loading format reflects the saving format*******
        //read a size of number of lists (use in for loop)
        //  read the title of that todoList
        //  read a size of that todoList (number of items, use in a nested for loop)
        //      create an empty list to store strings
        //      read the name from the file, use split by comma to access each component
        //      store elements of the readings into a list
        //  if the name of that file (key) already existed in the map, overwrite it
        //  if the name of that file hasn't existed, make a new map and put that map in the list
        //*****************************************************

        //this block of code will change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("saveLoadWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();
    }

    @FXML
    public void saveToFileButtonPushed(ActionEvent event) throws IOException {
        //one or multiple todoLists can be selected to be saved
        //launch another scene to ask for name and location (saveLoadWindow.fxml)
        //if returned value is null (from cancelButtonPushed), end method, returning null
        //if returned value is a list of strings (one element is a nameOfFile, one element is relative path)...

        //read the all the titles of those selected todoList as a list of string
        //****************format .txt*********************
        //#number of lists being saved
        //title of the todoList (first key in the string)
        //#number of items in that todoList         ---> list#1
        //each item:    nameOfTask,dueDate,description
        // ...
        //#number of items in that todoList         ---> list#2
        //each item:    nameOfTask,dueDate,description
        //...
        //************************************************
        //make a BufferedWriter, link to that file location and start writing
        //format of .txt is shown above, all data should be accessible in the selectedList list at this point

        //this block of code will change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("saveLoadWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //when first hit this scene, the Map will be empty map
        //if the map is empty, when display in tableView, should also have no problem (no data)

        //when revisit this scene after some adjustments to the map, the map should have some information
        //display the key to tableView (display name of lists)
    }
}
