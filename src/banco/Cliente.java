package banco;

public class Cliente {
	
	private String cpf;
	private String nome;
	
	public Cliente() {
		super();
		this.cpf = "111.111.111-77";
		this.nome = "Nome e Sobrenome";
	}
	public Cliente(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString(){
		return "Cliente de CPF: " + this.cpf + "e nome: " + this.nome;
	}
}
