package baseline;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class rootController {

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
    private TreeTableColumn<?, ?> selected;

    @FXML
    private TextField titleOfList;

}
