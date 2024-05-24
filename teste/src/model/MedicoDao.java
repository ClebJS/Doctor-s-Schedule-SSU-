package model;
import java.util.List;
public interface MedicoDao {
	public List<Medico> Medicos();
	public void addMedico(Medico medico);
}
