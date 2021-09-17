package br.ucsal.app;

import br.ucsal.app.model.Contato;
import br.ucsal.app.model.ContatoFamilia;
import br.ucsal.app.model.ContatoTrabalho;

public class Principal {

	public static void main(String[] args) {

		GerenciadorContatos meuGC = new GerenciadorContatos();
		// variavel Contato
		Contato contato1 = new ContatoTrabalho("Pedro","+55 71 98888-8888", "google");
		contato1.setEmail("pedro@google.com");
		meuGC.adicionarContato(contato1);
		
		Contato contato2 = new ContatoFamilia("Maria","+55 71 99999-8888");
		contato2.setEmail("maria@email.com") ;

		ContatoFamilia familia = (ContatoFamilia) contato2;
		familia.setAniversario("13/03");
		
		
		
		meuGC.adicionarContato(contato2);
		
		Contato x = meuGC.pesquisarContato("Pedro");
		System.out.println(x);

		x = meuGC.pesquisarContato("Maria");
		System.out.println(x);

		//nullPointerException x.telefone => null.telefone
		x = meuGC.pesquisarContato("Mario");
		if(x != null) {
			System.out.println(x.toString());
		}else {
			System.out.println(x);
		}
	}

}
