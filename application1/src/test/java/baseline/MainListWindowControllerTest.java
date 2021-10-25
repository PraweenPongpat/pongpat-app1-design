/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainListWindowControllerTest {

    @Test
    void addNewTaskButtonPushed() {
        //read the current list of Objects
        //manually add one object to it (expected)

        //read the current list of Objects
        //simulate the GUI with addButton (actual)

        //assertEqual the two lists expected and actual
    }

    @Test
    void editTaskButtonPushed() {
        //read the current list of Objects
        //access the list from a known index
        //manually edit that object with known Strings value (expected)

        //read the current list of Objects
        //simulate the GUI with editButton (actual)

        //assertEqual the two lists expected and actual
    }

    @Test
    void makeTaskCompleteButtonPushed() {
        //read the current list of Objects
        //access the list from a known index
        //manually edit the status of that object to be "complete" (expected)

        //read the current list of Objects
        //simulate the GUI with editButton (actual)

        //assertEqual the two lists expected and actual
    }

    @Test
    void makeTaskIncompleteButtonPushed() {
        //read the current list of Objects
        //access the list from a known index
        //manually edit the status of that object to be "incomplete" (expected)

        //read the current list of Objects
        //simulate the GUI with editButton (actual)

        //assertEqual the two lists expected and actual
    }

    @Test
    void removeTaskButtonPushed() {
        //read the current list of Objects
        //manually remove an object from the list (with known index) (expected)

        //read the current list of Objects
        //simulate the GUI with removeButtonPushed (actual)

        //assertEqual the two lists expected and actual
    }

    @Test
    void showTaskCompleteButtonPushed() {
        //read the current list of Objects
        //create the new (empty) list of Objects
        //loop through the informed list of objects
        //  store only objects that has "completed" state to the new list (expected)

        //simulate the same for the ShowCompleteButtonPushed (actual)

        //assertEqual the two lists expected and actual
    }

    @Test
    void showTaskIncompleteButtonPushed() {
        //read the current list of Objects
        //create the new (empty) list of Objects
        //loop through the informed list of objects
        //  store only objects that has "incomplete" state to the new list (expected)

        //simulate the same for the ShowIncompleteButtonPushed (actual)

        //assertEqual the two lists expected and actual
    }

    //to test if the list can hole at least 256 items to it
    //add the 257th and access it using other GUI functions to see if it works
    //we are not to implement the code for setting up the tableView
    //I don't see a way to set up the test for this yet

    //to test the due-date format
    //it will already be tested in the process of adding the task.
    //if adding the task is success, without launching another error window, meaning that the format is correct
}