package application;

public class Paciente {
	private int Idade;
	private String Nome;
	private float Peso;
	private String Historico;

	public void Consulta(int idade, String nome, String historico, int peso){
		this.Idade = idade;
		this.Nome = nome;
		this.Historico = historico;
		this.Peso = peso;
				
	}
}
