package application.controllers;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.DaoMed;
import model.Medico;

public class LoginController
{
	@FXML
	private TextField usuarioMed;
	@FXML
	private TextField senhalog;
	
	private Stage window;	
	private Scene scene;
	
	DaoMed medicoDao = DaoMed.getInstance();
	List<Medico> Medicos = medicoDao.Medicos();
	@FXML
	public void signin(ActionEvent event) throws IOException
	{
		System.out.print(medicoDao.Medicos.size());
		for(int i=0; i < medicoDao.Medicos.size(); i++)
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
	
	public void switchToWindow2(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}
}

	
