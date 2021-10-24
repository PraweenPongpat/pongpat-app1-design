package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AddEditWindowController implements Initializable {

    //this class needs initialization, with the default info passed from the other scene for user to fix, not type it all again

    @FXML
    private Button doneButton;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField taskDueDate;
    @FXML
    private TextArea taskInfo;
    @FXML
    private TextField taskTitle;

    private ItemsInATodoList editingList;
    public void setEditingList(ItemsInATodoList editingList) {
        this.editingList = editingList;
    }
    public ItemsInATodoList getEditingList() {
        return editingList;
    }

    @FXML
    ItemsInATodoList doneButtonPushed(ActionEvent event) throws IOException {
        //if the user click doneButton
        //read the text in all textFields
        //  read from taskTitle field, access the setter of ItemsInATodoList to set a new string to that title
        //  read from taskDueDate field, access the setter of ItemsInATodoList to set a new dueDate
        //      the validation for the due date is already inside the setter
        //  read from taskInfo field, access the setter of ItemsInATodoList to set a new description
        //launch a new scene (back to mainWindow.fxml)
        //return the adjusted object

        //this block of code will change***********************############################
        //only to change scene to edit a todoList
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

        //should be returning the object, not null
        return null;
    }

    @FXML
    ItemsInATodoList cancelButtonPushed(ActionEvent event) throws IOException {
        //if user pushed cancel Button
        //return null after changing a scene


        //this block of code will change***********************############################
        //only to change scene
        Parent goToPage2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainWindow.fxml")));
        Scene page2Scene = new Scene(goToPage2Parent);

        //get stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(page2Scene);
        window.show();

        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initialize the scene with the information
        //      when this scene is called, the object is passed in to set the information already
        //for adding information, the object will be empty, don't have to initialize anything
        //for editing information, the object will have information inside...
        //initialize all the textFields:
        //taskTitle field shows a current task title in the object
        //taskDueDate field shows a current task dueDate in the object
        //taskInfo field shows a current task description in the object
    }
}
