package application;

import java.util.ArrayList;
import java.util.List;

public class DaoPaciente implements PacienteDao {
		private static DaoPaciente instance;
		public List<Paciente> Pacientes;

		public DaoPaciente() {
			Pacientes = new ArrayList<Paciente>();
			Paciente p = new Paciente("123456", "Edgar", "123", "123");
			Paciente p1 = new Paciente("654321","Joao", "321", "123");
			Paciente p2 = new Paciente("321123", "Maria",  "312", "123");
			Pacientes.add(p);
			Pacientes.add(p1);
			Pacientes.add(p2);
		}
		
		@Override
		public List<Paciente> Pacientes() {
			return Pacientes;
		}

		@Override
		public void addPaciente(Paciente paciente) {
			Pacientes.add(paciente);
			
		}

		
		public static synchronized DaoPaciente getInstance()
	    {
	        if(instance == null)
	        {
	           instance=new DaoPaciente();
	        }
	        return instance;
	    }
	}

