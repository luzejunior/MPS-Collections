package agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Agenda {

	private Map<String, Pessoa> contatos;

	public Agenda() {
		super();
		this.contatos = new HashMap<String, Pessoa>();
	}
	
	public Pessoa buscaPessoa(String nome){
		Set<Entry<String, Pessoa>> set = contatos.entrySet();
		Iterator<Entry<String, Pessoa>> i = set.iterator();
		while(i.hasNext()){
			Entry<String, Pessoa> entry = (Entry<String, Pessoa>)i.next();
			if(entry.getKey() == nome){
				return entry.getValue();
			}
		}
		return null;
	}
	
	public void inserePessoa(Pessoa p){
		contatos.put(p.getNome(), p);
	}
	
	public ArrayList<String> listarNomes(){
		ArrayList<String> nomes = new ArrayList<String>();
		Set<Entry<String, Pessoa>> set = contatos.entrySet();
		Iterator<Entry<String, Pessoa>> i = set.iterator();
		while(i.hasNext()){
			Entry<String, Pessoa> entry = (Entry<String, Pessoa>)i.next();
			nomes.add(entry.getKey());
		}
		return nomes;
	}
	
	public ArrayList<Pessoa> listarPessoas(){
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Set<Entry<String, Pessoa>> set = contatos.entrySet();
		Iterator<Entry<String, Pessoa>> i = set.iterator();
		while(i.hasNext()){
			Entry<String, Pessoa> entry = (Entry<String, Pessoa>)i.next();
			pessoas.add(entry.getValue());
		}
		return pessoas;
	}
}
