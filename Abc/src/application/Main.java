package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
		
	@Override
	public void start(Stage stage) throws Exception {
		//Auto-generated method stub
		try {
			Parent roott = FXMLLoader.load(getClass().getResource("newscene.fxml"));
			
			Scene scene = new Scene(roott);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			
			stage.setScene(scene);
			//Stage.setFullScreen(true);
			stage.show();
			
			//stage.setOnCloseRequest(event -> logout(stage));
		}
		catch(Exception e) {
			//
			System.out.println(e);
		}
		
	}
	
 

	public static void main(String[] args) {
		launch(args);
	}

}
