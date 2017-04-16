package agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class UsaAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Joao", "1111-1111", "R. Joao");
		Pessoa pessoa3 = new Pessoa("Maria", "2222-2222", "R. Maria");
		Pessoa pessoa4 = new Pessoa("Jose", "3333-3333", "R. Jose");
		Pessoa pessoa5 = new Pessoa("Marco", "4444-4444", "R. Marco");
		Pessoa pessoa6 = new Pessoa("Ricardo", "5555-5555", "R. Ricardo");
		
		Agenda contatos = new Agenda();
		contatos.inserePessoa(pessoa1);
		contatos.inserePessoa(pessoa2);
		contatos.inserePessoa(pessoa3);
		contatos.inserePessoa(pessoa4);
		contatos.inserePessoa(pessoa5);
		contatos.inserePessoa(pessoa6);

		ArrayList<String> nomes = contatos.listarNomes();
		Iterator i = nomes.iterator();
		while(i.hasNext()){
			String c = (String)i.next();
			System.out.println(c.toString());
		}
		
		ArrayList<Pessoa> pessoas = contatos.listarPessoas();
		Iterator i1 = pessoas.iterator();
		while(i1.hasNext()){
			Pessoa p = (Pessoa)i1.next();
			System.out.println(p.toString());
		}
		
		Pessoa pessoaBuscada = contatos.buscaPessoa("Maria");
		System.out.println(pessoaBuscada.toString());
	}

}
