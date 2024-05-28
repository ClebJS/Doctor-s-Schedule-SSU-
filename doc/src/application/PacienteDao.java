package application;

import java.util.List;

public interface PacienteDao {
	public List<Paciente> Pacientes();
	public void addPaciente(Paciente paciente);
}
