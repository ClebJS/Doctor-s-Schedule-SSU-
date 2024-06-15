package application.Controller;

import java.io.IOException;

import application.Model.DaoMed;
import application.Model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroController {
	private Stage window;	
	private Scene scene;
	
	@FXML
	private TextField CRM;
	@FXML
	private TextField senha;
	@FXML
	private TextField mednome;
	public DaoMed medicoDao;
	
	public void switchToWindow1(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("/application/View/login.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}
	
	@FXML
	public void signup(ActionEvent event) throws IOException
	{
		Medico medico = new Medico(CRM.getText().toString(), mednome.getText().toString(),senha.getText().toString());
		medicoDao = DaoMed.getInstance();
		medicoDao.addMedico(medico);

	}

}