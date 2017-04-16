package banco;

import java.util.ArrayList;
import java.util.Iterator;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta();
		Conta conta2 = new Conta("0001", 200);
		Conta conta3 = new Conta("0002", 500);
		Conta conta4 = new Conta("0003", 1000);
		Conta conta5 = new Conta("0004", 2000);
		Conta conta6 = new Conta("0005", 4000);
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente("222.222.222-22", "Joao");
		Cliente cliente3 = new Cliente("333.333.333-33", "Maria");
		Cliente cliente4 = new Cliente("444.444.444-44", "Jose");
		
		Banco banco = new Banco();
		
		banco.inserir(conta1, cliente1);
		banco.inserir(conta2, cliente2);
		banco.inserir(conta3, cliente3);
		banco.inserir(conta4, cliente4);
		banco.inserir(conta5, cliente2);
		banco.inserir(conta6, cliente1);
		
		Cliente clienteBuscado = banco.buscaCliente("222.222.222-22");
		System.out.println(clienteBuscado.toString());
		
		Conta contaBuscada = banco.buscaConta("0005");
		System.out.println(contaBuscada.toString());
		
		ArrayList ArrayCliente = banco.buscaContasdeumCliente("111.111.111-77");
		Iterator i = ArrayCliente.iterator();
		while(i.hasNext()){
			Conta c = (Conta)i.next();
			System.out.println(c.toString());
		}
	}
}
