package application.Model;
import java.util.List;
public interface MedicoDao {
	public List<Medico> RetornarMedicos();
	public void addMedico(Medico medico);
}
