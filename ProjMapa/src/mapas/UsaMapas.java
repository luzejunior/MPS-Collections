package mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class UsaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> nOrdenado = new HashMap<String, String>();
		
		nOrdenado.put("ronaldo", "12345");
		nOrdenado.put("romario", "54321");
		nOrdenado.put("roberto", "13254");
		
		Set<Entry<String, String>> set = nOrdenado.entrySet();
		Iterator<Entry<String, String>> i = set.iterator();
		System.out.println("Antes de Ordenar: ");
		while(i.hasNext()){
			Entry<String, String> entry = (Entry<String, String>)i.next();
			System.out.println("Nome: " + entry.getKey());
		}
		
		Map<String, String> sOrdenado = new TreeMap<String, String>();
		
		sOrdenado.put("ronaldo", "12345");
		sOrdenado.put("romario", "54321");
		sOrdenado.put("roberto", "13254");
		
		Set<Entry<String, String>> setOrdenado = sOrdenado.entrySet();
		Iterator<Entry<String, String>> iOrdenado = setOrdenado.iterator();
		System.out.println("Depois de Ordenar: ");
		while(iOrdenado.hasNext()){
			Entry<String, String> entry = (Entry<String, String>)iOrdenado.next();
			System.out.println("Nome: " + entry.getKey());
		}
		
	}

}
