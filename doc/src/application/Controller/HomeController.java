package application.Controller;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Model.DaoPaciente;
import application.Model.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeController extends NotfController implements Initializable{
	private Stage window;	
	private Scene scene;
	
	@FXML
	private Label nome;
	
	@FXML
	private Label nomegrande;
	
	@FXML
	private DatePicker data;

	
	public static Label nome_static;
	public static Label nomegrande_static;
	
	@FXML
	private Text n1;
	
	@FXML
	private Text n2;
	
	@FXML
	private Text n3;
	
	DaoPaciente pacienteDao = DaoPaciente.getInstance();
	List<Paciente> Pacientes = pacienteDao.RetornarPacientes();
	@FXML
	public void switchToWindow1(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("/application/View/login.fxml"));
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
	@FXML
	public void pacientebotao(ActionEvent event) throws IOException
	{
		Stage tela = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/View/addpaciente.fxml"));
		scene = new Scene(root);
		tela.setTitle("SSU Agenda");
		tela.setScene(scene);
		tela.show();
		Image icon = new Image("\\images\\SSU.png");
		tela.getIcons().add(icon);
	}
	
	public void notfbotao(ActionEvent event) throws IOException
	{
		Stage tela = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/View/notificações.fxml"));
		scene = new Scene(root);
		tela.setTitle("SSU Agenda");
		tela.setScene(scene);
		tela.show();
		Image icon = new Image("\\images\\SSU.png");
		tela.getIcons().add(icon);
	}
	
	
	@FXML
	public void pacienteabrir1(ActionEvent event) throws IOException
	{
			Paciente paciente = pacienteDao.RetornarPacientes().get(0);
			if(n1.getText().toString().equals(paciente.getNome()))
			{
				Stage tela = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/application/View/paciente.fxml"));
				scene = new Scene(root);
				tela.setTitle("SSU Agenda");
				tela.setScene(scene);
				tela.show();
				Image icon = new Image("\\images\\SSU.png");
				tela.getIcons().add(icon);
				nm_static.setText(paciente.getNome());
				idd_static.setText(paciente.getIdade());
				sx_static.setText(paciente.getSexo());
				peso_static.setText(paciente.getPeso());
				hist_static.setText(paciente.getHistorico());
			}
	}
	@FXML
	public void pacienteabrir2(ActionEvent event) throws IOException
	{
			Paciente paciente = pacienteDao.RetornarPacientes().get(1);
			if(n2.getText().toString().equals(paciente.getNome()))
			{
				Stage tela = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/application/View/paciente.fxml"));
				scene = new Scene(root);
				tela.setTitle("SSU Agenda");
				tela.setScene(scene);
				tela.show();
				Image icon = new Image("\\images\\SSU.png");
				tela.getIcons().add(icon);
				nm_static.setText(paciente.getNome());
				idd_static.setText(paciente.getIdade());
				sx_static.setText(paciente.getSexo());
				peso_static.setText(paciente.getPeso());
				hist_static.setText(paciente.getHistorico());
			}
	}
	@FXML
	public void pacienteabrir3(ActionEvent event) throws IOException
	{
			Paciente paciente = pacienteDao.RetornarPacientes().get(2);
			if(n3.getText().toString().equals(paciente.getNome()))
			{
				Stage tela = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/application/View/paciente.fxml"));
				scene = new Scene(root);
				tela.setTitle("SSU Agenda");
				tela.setScene(scene);
				tela.show();
				Image icon = new Image("\\images\\SSU.png");
				tela.getIcons().add(icon);
				nm_static.setText(paciente.getNome());
				idd_static.setText(paciente.getIdade());
				sx_static.setText(paciente.getSexo());
				peso_static.setText(paciente.getPeso());
				hist_static.setText(paciente.getHistorico());
			}
	}
	
	
}
