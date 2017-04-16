package agenda;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String endereco;
	
	public Pessoa() {
		super();
		this.nome = "Nome e Sobrenome";
		this.telefone = "7777-1111";
		this.endereco = "Logradouro Xpto";
	}
	
	public Pessoa(String nome, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString(){
		return "Nome: " + this.nome + " Telefone: " + this.telefone + " Endereço: " + this.endereco;
	}
}
