package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddPacienteController{
	private Stage window;	
	private Scene scene;	
	@FXML
	private TextField Nome;
	
	@FXML
	private TextField Idade;
	
	@FXML
	private TextField Peso;
	
	@FXML
	private TextField Sexo;
	
	@FXML
	private TextArea Hist;
	
	public DaoPaciente daopaciente;
	
	@FXML
	public void mudarhome(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("addpaciente.fxml"));
		window = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		window.setScene(scene);
		window.show();
	}
	
	@FXML
	public void CadPaciente(ActionEvent event) throws IOException
	{
		Paciente paciente = new Paciente(Idade.getText().toString(), Nome.getText().toString(), Hist.getText().toString(), Peso.getText().toString());
		daopaciente = DaoPaciente.getInstance();
		daopaciente.addPaciente(paciente);

	}
}
