package br.ucsal.app;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import br.ucsal.app.model.Contato;
import br.ucsal.app.model.ContatoFamilia;
import br.ucsal.app.model.ContatoTinder;
import br.ucsal.app.model.ContatoTrabalho;
import br.ucsal.app.persistencia.ContatoDAO;
import br.ucsal.app.servico.GerenciadorContatos;

public class Principal {

	public static void main(String[] args) {
		

		GerenciadorContatos meuGC = new GerenciadorContatos(new ContatoDAO());
		
		 try {
			meuGC.adicionarContato(null,"+55 71 98888-7777");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		 try {
			Contato c = new ContatoFamilia("a","+55 71 98888-7777");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Contato contato = null;
		try {
			contato = new ContatoFamilia("Sergio Carlos","+55 71 98888-7777");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		meuGC.adicionarContato(contato);
		
		// variavel Contato
		Contato contato1 = null;
		try {
			contato1 = new ContatoTrabalho("Pedro Lucas","+55 71 98888-8888", "google");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		contato1.setEmail("pedro@google.com");
		meuGC.adicionarContato(contato1);
		
		Contato contato2 = null;
		try {
			contato2 = new ContatoFamilia("Maria Sofia","+55 71 99999-8888");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		
		try {
			meuGC.adicionarContato(new ContatoTinder("APELIDO"," 1232132323"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		meuGC.enviarEmail("Convite");
		
		meuGC.compartilhar("Maria");
		
		meuGC.compartilhar("APELIDO");
		
		System.out.println("LISTA");
		meuGC.listar();
		
	}

}
