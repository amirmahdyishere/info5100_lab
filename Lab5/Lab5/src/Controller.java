
import static java.lang.System.lineSeparator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amirp
 */
public class Controller {
    
    @FXML
    TextField nameTextField;
    
    @FXML
    TextField ageTextField;
    
    @FXML
    TextField emailTextField;
    
    
    public void submit(ActionEvent event){
        
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        
        int ageInt = Integer.parseInt(age);
        
        if(ageInt >= 0 && email.contains("@") && email.contains("@")){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Submitted");
            alert.setHeaderText("Thank You");
            alert.setContentText("Submitted!" + lineSeparator() +
                                 "Name: " + name + lineSeparator() +
                                 "Email: " + email + lineSeparator() + 
                                 "Age: " + age );
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Submit Failed");
            alert.setHeaderText("Warning");
            alert.setContentText("Check your information please!");
            alert.showAndWait();
        }
    }
}
