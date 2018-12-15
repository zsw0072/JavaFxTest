package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.Converter.FileConverter;

import javax.xml.soap.Text;
import java.io.File;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Button sourceBtn;

    @FXML
    private Button destBtn;

    @FXML
    private Button convert;

    @FXML
    private TextField sourceTxt;

    @FXML
    private TextField destTxt;

    public void initialize(URL location, ResourceBundle resources) {
        // TODO (don't really need to do anything here).
    }

    @FXML
    private String getSourcePath(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(new Stage());
        System.out.printf(file.getAbsolutePath());
        sourceTxt.setText(file.getAbsolutePath());
        return file.getAbsolutePath();
    }

    @FXML
    private String setDestPath(ActionEvent event){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File file = directoryChooser.showDialog(new Stage());
        destTxt.setText(file.getAbsolutePath());
        return file.getAbsolutePath();
    }

    @FXML
    private void convertToExcel(ActionEvent event) throws Exception{
        String sourceTxtPath = sourceTxt.getText();
        String destPath = destTxt.getText();
        FileConverter.ConvertTxtToExcel(sourceTxtPath,destPath,"2018-11");
    }
}
