package application;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends HomeController implements Initializable
{
	@FXML
	private Label resultado;
	@FXML
	private TextField usuarioMed;
	@FXML
	private TextField senhalog;
	
	private Stage window;	
	private Scene scene;

	DaoMed medicoDao = DaoMed.getInstance();
	List<Medico> Medicos = medicoDao.RetornarMedicos();
	@FXML
	public void signin(ActionEvent event) throws IOException
	{

		for(int i=0; i < medicoDao.Medicos.size(); i++)
		{
			Medico Medico = medicoDao.RetornarMedicos().get(i);
			if(senhalog.getText().equals(Medico.getSenha()) && usuarioMed.getText().equals(Medico.getCRM())) {
				Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
				window = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				window.setScene(scene);
				window.show();
				nome_static.setText(Medico.getNome());
				nomegrande_static.setText(Medico.getNome());
			}
			else
			{
					resultado.setText("usuário/senha incorreto");
			}
		}
		
	}
	
	
	public void switchToWindow2(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}

	

