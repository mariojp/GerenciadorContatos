package br.ucsal.app;

import java.util.Comparator;

import br.ucsal.app.model.Contato;

public class CompareUltimoNome implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Contato contato1 = (Contato) o1;
		Contato contato2 = (Contato) o2;
		return contato1.getLastName().compareTo(contato2.getLastName());
	}

}
