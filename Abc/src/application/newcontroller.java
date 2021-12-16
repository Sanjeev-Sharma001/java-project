package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class newcontroller {
	
	@FXML
	private Button logoutbutton;
	@FXML
	private AnchorPane scenepane;
	
    Stage stage;
      
      
      public void logout(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	
    	alert.setTitle("Logout");
    	alert.setHeaderText("You are about to logout");
    	alert.setContentText("Do you want to save your information ?");
    	
    	if(alert.showAndWait().get() == ButtonType.OK) {
    		stage = (Stage) scenepane.getScene().getWindow();
      		System.out.println("You successfully logged out");
      		stage.close();

    	}
    	
  		
      }
	
	


}
