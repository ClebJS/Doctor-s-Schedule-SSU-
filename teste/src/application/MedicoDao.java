package application;
import java.util.List;
public interface MedicoDao {
	public List<Medico> Medicos();
	public void addMedico(Medico Cad);
	public Medico getMedico(int senha);
}
