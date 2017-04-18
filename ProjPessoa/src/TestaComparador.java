import java.util.TreeSet;

public class TestaComparador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Pessoa> ordenaNome = new TreeSet<Pessoa>(new ComparadorNome());
		ordenaNome.add(new Pessoa("111.111.111-11", "Ronaldo", new Data(01,01,1990)));
		ordenaNome.add(new Pessoa("555.555.555-11", "Romario", new Data(02,02,1991)));
		ordenaNome.add(new Pessoa("333.333.333-11", "Romario", new Data(03,03,1992)));
		ordenaNome.add(new Pessoa("444.444.444-11", "Joao", new Data(04,04,1990)));
		System.out.println("Ordenando por Nome:");
		for(Pessoa p:ordenaNome){
			System.out.println("CPF: " + p.cpf + " Nome: " + p.nome + " Data Nascimento: " + p.data_nascimento.toString());
		}

		TreeSet<Pessoa> ordenaDataNasc = new TreeSet<Pessoa>(new ComparadorDataNasc());
		ordenaDataNasc.add(new Pessoa("111.111.111-11", "Ronaldo", new Data(01,01,1990)));
		ordenaDataNasc.add(new Pessoa("555.555.555-11", "Romario", new Data(02,02,1991)));
		ordenaDataNasc.add(new Pessoa("333.333.333-11", "Romario", new Data(03,03,1992)));
		ordenaDataNasc.add(new Pessoa("444.444.444-11", "Joao", new Data(04,04,1990)));
		System.out.println("Ordenando por Data de Nascimento:");
		for(Pessoa p:ordenaDataNasc){
			System.out.println("CPF: " + p.cpf + " Nome: " + p.nome + " Data Nascimento: " + p.data_nascimento.toString());
		}
	}
}
