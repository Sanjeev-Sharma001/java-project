package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class controller2 {
	
	 
	@FXML
	private Pane mypane;
	@FXML
	private ColorPicker mycolorpick;
	
	
	public void colorcane(ActionEvent event) {
		Color mycolor = mycolorpick.getValue();
		mypane.setBackground(new Background(new BackgroundFill(mycolor,null,null)));
	}
	
 
}
