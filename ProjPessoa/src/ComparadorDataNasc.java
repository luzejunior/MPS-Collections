import java.util.Comparator;

public class ComparadorDataNasc implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if(o1.data_nascimento.ano > o2.data_nascimento.ano){
			return 1;
		}
		else if(o1.data_nascimento.ano < o2.data_nascimento.ano){
			return -1;
		}
		return Integer.compare(o1.data_nascimento.mes, o2.data_nascimento.mes);
	}

}
