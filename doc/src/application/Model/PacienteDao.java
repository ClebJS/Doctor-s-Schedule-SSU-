package application.Model;

import java.util.List;

public interface PacienteDao {
	public List<Paciente> RetornarPacientes();
	public void addPaciente(Paciente paciente);

}
