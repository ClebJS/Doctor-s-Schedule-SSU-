package application;

import java.util.ArrayList;
import java.util.List;

public class DaoPaciente implements PacienteDao {
		private static DaoPaciente instance;
		public List<Paciente> Pacientes;

		public DaoPaciente() {
			Pacientes = new ArrayList<Paciente>();
			Paciente p = new Paciente("69", "Sérgio Montes", "Pressão alta", "60", "Masc");
			Paciente p1 = new Paciente("24","Clara Passos", "Diabetes", "58", "Fem");
			Paciente p2 = new Paciente("22", "João Carlos",  "Erupção cutanea", "65", "Masc");
			Pacientes.add(p);
			Pacientes.add(p1);
			Pacientes.add(p2);
		}
		
		@Override
		public List<Paciente> RetornarPacientes() {
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

