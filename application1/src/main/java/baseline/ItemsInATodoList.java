/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

//this is the class that will store object that represent each item in one todoList
public class ItemsInATodoList {
    //three variables for a task [name,date,description]
    private String taskTitle;
    private String taskDueDate;
    private String taskInfo;
    private String taskStatus;

    //constructor
    public ItemsInATodoList(String taskTitle, String taskDueDate, String taskInfo) {
        this.taskTitle = taskTitle;

        //validate format of the taskDueDate
        //if the taskDueDate matches YYYY-MM-DD format (using regex)
        this.taskDueDate = taskDueDate;
        //if not, launch the errorDisplayWindow.fxml shows that the format must be YYYY-MM-DD

        this.taskInfo = taskInfo;
        this.taskStatus = "incomplete"; //always set taskStatus to "incomplete" as a default
    }

    //make getters and setters
    /*
    MAKE IT LATER, that's somewhat logic-like
    use the setters to ADD or EDIT a task
            setters for taskStatus should only set to either 1 or 0 ("complete" or "incomplete")
    use the getters to retrieve string from that task
    ****date must be verified with regex in the format of YYYY-MM--DD in setTaskDueDate*****
     */

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    //must have validation
    public void setTaskDueDate(String taskDueDate) {
        //validate format of the taskDueDate
        //if the taskDueDate matches YYYY-MM-DD format (using regex)
        this.taskDueDate = taskDueDate;
        //if not, launch the errorDisplayWindow.fxml shows that the format must be YYYY-MM-DD
    }

    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDueDate() {
        return taskDueDate;
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public String getTaskStatus() {
        return taskStatus;
    }
}
