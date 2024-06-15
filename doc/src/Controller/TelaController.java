package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaController
{	
	@FXML
	private TextField usuario;
	@FXML
	private Button button;
	@FXML
	private TextField CRM;
	@FXML
	private TextField senha;
	
	private Stage window;	
	private Scene scene;
	
	@FXML
	private TextField usuarioMed;
	@FXML
	private TextField senhalog;
	public DaoMed medicoDao;
	
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

	}

