package application.Model;

public class Paciente {
	private String Idade;
	private String Nome;
	private String Peso;
	private String Historico;
	private String Sexo;
	private String Data;
	

	public Paciente(String idade, String nome, String historico, String peso, String sexo, String data){
		this.setIdade(idade);
		this.setNome(nome);
		this.setHistorico(historico);
		this.setPeso(peso);
		this.setSexo(sexo);
		this.setData(data);		
	}
	
	public Paciente(String idade, String nome, String historico, String peso, String sexo){
		this.setIdade(idade);
		this.setNome(nome);
		this.setHistorico(historico);
		this.setPeso(peso);
		this.setSexo(sexo);
				
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

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
}
