package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Button sourceBtn;

    @FXML
    private Button destBtn;

    @FXML
    private Text sourceTxt;

    @FXML
    private TextField destTxt;

    public void initialize(URL location, ResourceBundle resources) {
        // TODO (don't really need to do anything here).
    }

    @FXML
    protected void showDateTime(ActionEvent event) {
        System.out.println("Button Clicked!");
        sourceTxt.setValue("hello world");
    }
}
