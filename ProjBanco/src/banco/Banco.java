package banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Banco {

	Map<Conta, Cliente> cadastros = new HashMap<Conta, Cliente>();
	
	public void inserir(Conta conta, Cliente cliente){
		cadastros.put(conta, cliente);
	}
	
	public Conta buscaConta(String numero){
		Set<Entry<Conta, Cliente>> set = cadastros.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Entry<Conta, Cliente> entry = (Entry)i.next();
			if(entry.getKey().getNumero() == numero){
				return entry.getKey();
			}
		}
		return null;
	}
	
	public Cliente buscaCliente(String cpf){
		Set<Entry<Conta, Cliente>> set = cadastros.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Entry<Conta, Cliente> entry = (Entry)i.next();
			if(entry.getValue().getCpf() == cpf){
				return entry.getValue();
			}
		}
		return null;
	}
	
	public ArrayList buscaContasdeumCliente(String cpf){
		ArrayList<Conta> contasDoCliente = new ArrayList<Conta>();
		Set<Entry<Conta, Cliente>> set = cadastros.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Entry<Conta, Cliente> entry = (Entry)i.next();
			if(entry.getValue().getCpf() == cpf){
				contasDoCliente.add(entry.getKey());
			}
		}
		return contasDoCliente;
	}
}
