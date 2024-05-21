package application;

import java.util.ArrayList;
import java.util.List;

public class DaoMed implements MedicoDao{
	
	List<Medico> Medicos;
	
	public DaoMed() {
		Medicos = new ArrayList<Medico>();
		Medico med = new Medico(123456, "Edgar", 123);
		Medico med1 = new Medico(654321, "Livia", 321);
		Medico med2 = new Medico(321123, "Marina", 312);
		Medicos.add(med);
		Medicos.add(med1);
		Medicos.add(med2);
	}
	
	@Override
	public List<Medico> Medicos() {
		return Medicos;
	}

	@Override
	public void addMedico(Medico Medico) {
		Medicos.get(Medico.getSenha()).setNome(Medico.getNome());
	}

	@Override
	public Medico getMedico(int senha) {
	
		return Medicos.get(senha);
	}
}
