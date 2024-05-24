package application;

public class Paciente {
	private int Idade;
	private String Nome;
	private float Peso;
	private String Historico;

	public void Consulta(int idade, String nome, String historico, int peso){
		this.setIdade(idade);
		this.setNome(nome);
		this.setHistorico(historico);
		this.setPeso(peso);
				
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public float getPeso() {
		return Peso;
	}

	public void setPeso(float peso) {
		Peso = peso;
	}

	public String getHistorico() {
		return Historico;
	}

	public void setHistorico(String historico) {
		Historico = historico;
	}
}
