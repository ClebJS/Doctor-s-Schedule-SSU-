package application;

import java.io.IOException;
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

public class TelaController extends DaoMed{	
	@FXML
	private Label resultado;
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
	MedicoDao medicoDao = new DaoMed();
	
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
	@FXML
	public void signup(ActionEvent event) throws IOException
	{
		Medico medico = new Medico(CRM.getText().toString(), senha.getText().toString());
		medicoDao.addMedico(medico);
		System.out.print(medicoDao.Medicos());

	}
	@FXML
	public void signin(ActionEvent event) throws IOException
	{
		System.out.print(medicoDao.Medicos().size());
		for(int i=0; i < medicoDao.Medicos().size(); i++)
		{
			Medico Medico = medicoDao.Medicos().get(i);
			if(senhalog.getText().equals(Medico.getSenha()) && usuarioMed.getText().equals(Medico.getCRM())) {
				Parent root = FXMLLoader.load(getClass().getResource("admincad.fxml"));
				window = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				window.setScene(scene);
				window.show();
			}
		}
		
	}


	


}
