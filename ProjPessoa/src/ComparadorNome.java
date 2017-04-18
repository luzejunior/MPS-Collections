import java.util.Comparator;

public class ComparadorNome implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if (o1.nome.equals(o2.nome)){
			return o1.cpf.compareTo(o2.cpf);
		}else{
        return o1.nome.compareTo(o2.nome);
		}
	}
}
