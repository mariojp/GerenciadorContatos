package br.ucsal.app;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import br.ucsal.app.model.Contato;
import br.ucsal.app.model.ContatoFamilia;
import br.ucsal.app.model.ContatoTinder;
import br.ucsal.app.model.ContatoTrabalho;

public class Principal {

	public static void main(String[] args) {
		

		GerenciadorContatos meuGC = new GerenciadorContatos();
		
		
		
		Contato contato = new ContatoFamilia("Sergio Carlos","+55 71 98888-7777");
		
		
		meuGC.adicionarContato(contato);
		
		// variavel Contato
		Contato contato1 = new ContatoTrabalho("Pedro Lucas","+55 71 98888-8888", "google");
		contato1.setEmail("pedro@google.com");
		meuGC.adicionarContato(contato1);
		
		Contato contato2 = new ContatoFamilia("Maria Sofia","+55 71 99999-8888");
		contato2.setEmail("maria@email.com") ;

		ContatoFamilia familia = (ContatoFamilia) contato2;
		familia.setAniversario("13/03");
		
		
		
		meuGC.adicionarContato(contato2);
		
		Contato x = meuGC.pesquisarContato("Pedro Lucas");
		System.out.println(x);

		x = meuGC.pesquisarContato("Maria Sofia");
		System.out.println(x);

		//nullPointerException x.telefone => null.telefone
		x = meuGC.pesquisarContato("Mario");
		if(x != null) {
			System.out.println(x.toString());
		}else {
			System.out.println(x);
		}
		
		
		meuGC.adicionarContato(new ContatoTinder("APELIDO"," 1232132323"));
		
		meuGC.enviarEmail("Convite");
		
		meuGC.compartilhar("Maria");
		
		meuGC.compartilhar("APELIDO");
		
		System.out.println("LISTA");
		meuGC.listar();
		
	}

}
