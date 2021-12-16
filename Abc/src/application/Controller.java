package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	TextField nametextfield;
	private Stage stage;
	private Scene scene;
	private Parent roott;
	
	public void login(ActionEvent event) throws IOException {
		
		
 		String username = nametextfield.getText();
 		FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
 		roott = loader.load();
 		
 		controller2 controller2 = loader.getController();
 		//Parent roott = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		scene = new Scene(roott);
		stage.setScene(scene);
		stage.show();
 	}
	
	 
	
	
	

}
