/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {
    //start function to launch the root window
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rootWindow.fxml")));

        Scene scene = new Scene(root);

        //set the Map<String,list<obj>> to be a new-made empty map
        //use the setter in RootController class

        //set title of the stage (will always use the same stage along the app, except errorDisplay)
        //error display stage will always be a new stage when launched
        stage.setTitle("ToDoLists Application");

        //load and display a new scene
        stage.setScene(scene);
        stage.show();
    }
    //main to launch GUI
    public static void main(String[] args) {
        launch(args);
    }




}




