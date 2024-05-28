package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeController implements Initializable{
	private Stage window;	
	private Scene scene;
	@FXML
	private Label nome;
	@FXML
	private Label nomegrande;
	public static Label nome_static;
	public static Label nomegrande_static;	
	public void switchToWindow1(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nome_static = nome;
		nomegrande_static = nomegrande;
	}
	
	
}
