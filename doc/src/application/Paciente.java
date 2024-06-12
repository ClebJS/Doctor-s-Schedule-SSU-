package application;

public class Paciente {
	private String Idade;
	private String Nome;
	private String Peso;
	private String Historico;


	public Paciente(String idade, String nome, String historico, String peso){
		this.setIdade(idade);
		this.setNome(nome);
		this.setHistorico(historico);
		this.setPeso(peso);
				
	}

	public String getIdade() {
		return Idade;
	}

	public void setIdade(String idade) {
		Idade = idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getPeso() {
		return Peso;
	}

	public void setPeso(String peso) {
		Peso = peso;
	}

	public String getHistorico() {
		return Historico;
	}

	public void setHistorico(String historico) {
		Historico = historico;
	}
}
