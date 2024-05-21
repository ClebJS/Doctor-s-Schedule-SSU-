package application;

public class Medico {
	private int crm;
	private String nome;
	private int senha;

	public Medico(int crm, String nome, int senha){
		this.crm = crm;
		this.nome = nome;
		this.senha = senha;
				
	}
	public Medico(){

				
	}

	public int getCRM() {
		return crm;
	}

	public void setCRM(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}


}
