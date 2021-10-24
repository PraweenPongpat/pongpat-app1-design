package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootControllerTest {

    //add to list button will be used to test ad a new todoList
    //inside the adding process, it will also verify the 3char long of the list name also
    @Test
    void addToListButtonPushed() {
        //get the current map from RootController Class to local Map variable#1 (expected)
        //manually add a list to the class
        //get the current map from RootController Class to local Map variable#2 (actual)
        //simulate the addButtonPushed function

        //assertEqual for expected and actual
    }

    @Test
    void delFromListButtonPushed() {
        //get the current map from RootController Class to local Map variable#1 (expected)
        //manually remove a list from that map
        //get the current map from RootController Class to local Map variable#2 (actual)
        //simulate the delButtonPushed function

        //assertEqual for expected and actual
    }

    @Test
    void editAListButtonPushed() {
        //get the current map from RootController Class to local Map variable#1 (expected)
        //manually access the map through the key
        //edit that list of object

        //get the current map from RootController Class to local Map variable#2 (actual)
        //simulate the edit function through GUI
        //edit the information to be the same

        //assertEqual for expected and actual
    }

    @Test
    void loadFromFileButtonPushed() {
        //read the file from the relative path in the 'docs' directory
        //the file will be returned as a string or StringBuilder (expected)

        //simulate the read GUI loadButton (actual)

        //assertEqual the expected and actual
    }

    @Test
    void saveToFileButtonPushed() {
        //simulate the GUI save file buttons
        //test if the file exists using .exists (actual)

        //we know a newly saved file should be there (expected = true)
        //assertEqual the expected and actual
    }

    //to test if the app can hole at least 256 lists to it
    //add the 257th and access it using other GUI functions to see if it works
    //we are not to implement the code for setting up the tableView
    //I don't see a way to set up the test for this yet
}