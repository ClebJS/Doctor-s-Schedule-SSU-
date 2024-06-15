package application;

public class Medico {
	private String crm;
	private String nome;
	private String senha;

	public Medico(String crm, String nome, String senha){
		this.crm = crm;
		this.nome = nome;
		this.senha = senha;
				
	}


	public Medico(String crm, String senha) {
		this.crm = crm;
		this.senha = senha;
	}


	public String getCRM() {
		return crm;
	}

	public void setCRM(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}



}
