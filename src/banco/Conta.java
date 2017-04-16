package banco;

public class Conta {
	
	private String numero;
	private double saldo;
	
	public Conta(){
		this.numero = "7777";
		this.saldo = 77;
	}
	
	public Conta(String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getNumero(){
		return numero;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void debitarValor(double valor){
		if(saldo < valor){
			System.out.println("Você não tem fundos suficientes");
		}
		else{
			saldo = saldo - valor;
		}
	}
	
	public void creditarValor(double valor){
		saldo = saldo + valor;
	}
	
	public String toString(){
		return "Numero da conta: " + this.numero + " com saldo: " + this.saldo;
	}
}
