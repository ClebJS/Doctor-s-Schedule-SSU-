package application.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class NotfController implements Initializable{
	@FXML
	private Label nm;
	
	@FXML
	private Label idade;
	
	@FXML
	private Label sexo;
	
	@FXML
	private Label peso;
	
	@FXML
	private Label hist;
	
	public static Label nm_static;
	public static Label idd_static;
	public static Label sx_static;
	public static Label peso_static;
	public static Label hist_static;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nm_static = nm;
		idd_static = idade;
		sx_static = sexo;
		peso_static = peso; 
		hist_static = hist;
	}
	
}
