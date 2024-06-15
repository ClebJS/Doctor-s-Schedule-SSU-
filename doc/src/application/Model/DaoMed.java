package application.Model;

import java.util.ArrayList;
import java.util.List;

public class DaoMed implements MedicoDao {
	private static DaoMed instance;
	public List<Medico> Medicos;

	public DaoMed() {
		Medicos = new ArrayList<Medico>();
		Medico med = new Medico("123456", "Edgar", "123");
		Medico med1 = new Medico("654321","Joao", "321");
		Medico med2 = new Medico("321123", "Maria",  "312");
		Medicos.add(med);
		Medicos.add(med1);
		Medicos.add(med2);
	}
	
	@Override
	public List<Medico> RetornarMedicos() {
		return Medicos;
	}

	@Override
	public void addMedico(Medico medico) {
		Medicos.add(medico);
		
	}

	
	public static synchronized DaoMed getInstance()
    {
        if(instance == null)
        {
           instance=new DaoMed();
        }
        return instance;
    }
}