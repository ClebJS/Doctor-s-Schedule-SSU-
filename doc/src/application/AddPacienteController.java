package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddPacienteController{
	private Stage window;	
	private Scene scene;	
	
	@FXML
	public void mudarhome(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("addpaciente.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}
}
