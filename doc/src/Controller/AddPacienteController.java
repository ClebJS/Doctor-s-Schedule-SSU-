package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddPacienteController
{

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
	
	DaoPaciente pacienteDao = DaoPaciente.getInstance();
	@FXML
	private Label resposta;
	
	
	@FXML
	public void CadPaciente(ActionEvent event) throws IOException
	{
		
		for(Paciente paciente: pacienteDao.RetornarPacientes())
		{
			if(Nome.getText().equals(paciente.getNome()))
			{
				paciente.setIdade(Idade.getText());
				paciente.setPeso(Peso.getText());
				paciente.setSexo(Sexo.getText());
				paciente.setHistorico(Hist.getText());
			}
		}
		resposta.setText("Paciente atualizado");
	}
}
