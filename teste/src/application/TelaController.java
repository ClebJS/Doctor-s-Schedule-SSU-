package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaController {	
	@FXML
	private Label resultado;
	@FXML
	private TextField usuario;
	@FXML
	private Button button;
	private Stage window;	
	private Scene scene;
	public void switchToWindow1(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}
	
	public void switchToWindow2(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}
	
	public void switchToWindow3(ActionEvent event) throws IOException
	{
		try {
		if(usuario.getText().toString().equals("ivo"))
		{
			Parent root = FXMLLoader.load(getClass().getResource("admincad.fxml"));
			window = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			window.setScene(scene);
			window.show();	
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void cadastro(ActionEvent event) throws IOException
	{
		ArrayList<Medico> Medicos = new ArrayList<Medico>();
		Medico m = new Medico();
		m.setCRM(0);
		m.setNome(null);
		m.setSenha(0);
		Medicos.add(m);
	}

	


}
