package br.ucsal.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.ucsal.app.model.Contato;
import br.ucsal.app.model.ContatoFamilia;
import br.ucsal.app.model.ContatoTinder;
import br.ucsal.app.model.ContatoTrabalho;

// public class GerenciadorContatos extends Object {
public class GerenciadorContatos {

	
	//Coleções
	//Atributos
	//private Contato[] meusAmigos; //Estatica
	//private int quantidadeAmigos;
	
	private Set<Contato> meusAmigos;
	
	//ArrayOutOfBound
	//Construtor
	GerenciadorContatos() {
		//this.meusAmigos = new Contato[5000];
		this.meusAmigos = new TreeSet();
		//this.quantidadeAmigos = 0;
	}
	
	/**
	 * 
	 * @param contato
	 */
	public void adicionarContato(Contato contato) {
		if(this.existeContato(contato) == false) {
			//this.meusAmigos[quantidadeAmigos] = contato;
			//quantidadeAmigos = quantidadeAmigos + 1;
			//this.quantidadeAmigos++;
			meusAmigos.add(contato);
		}
	}
	
	
	public void removerContato(Contato contato) {
		if(this.existeContato(contato) == true) {
			meusAmigos.remove(contato);
		}
	}
	
	private boolean existeContato(Contato busca) {

//		for(int i = 0; i < this.quantidadeAmigos ; i++ ) {
//			Contato contato = this.meusAmigos[i];
//			if(contato.getNome().equals(busca.getNome())) {
//				return true;
//			}
//		}
		
//		for(int i = 0; i < meusAmigos.size() ; i++ ) {
//			Contato contato = meusAmigos.get(i);
//			if(contato.getNome().equals(busca.getNome())) {
//				return true;
//			}
//		}
		
//		Iterator<Contato> it = meusAmigos.iterator();
//		while(it.hasNext()) {
//			Contato contato = it.next();
//			if(contato.getNome().equals(busca.getNome())) {
//				return true;
//			}
//		}
		
		for(Contato contato : meusAmigos) {
			if(contato.getNome().equals(busca.getNome())) {
				return true;
			}
		}
		
		return false;
	
	}

	
	/**
	 * 
	 * @param byNome
	 * @return Contato ou null 
	 */
	//Tipo de retorno [nomeCamelCase] (tipo var, Tipo var )
	public Contato pesquisarContato(String byNome) {
								
		for(Contato contato : meusAmigos) {
			if(contato.getNome().contains(byNome)) {
				return contato;
			}
		}
		return null;
	}
	
	
	public void listar() {
		//Object[] contatos =  meusAmigos.toArray();
		//.sort(contatos);
		//Arrays.sort(contatos, new CompareUltimoNome());
		for(Contato contato : meusAmigos) {
			System.out.println(contato);
		}
	}
	
	
	public void enviarEmail(String texto) {
		for(Contato contato : meusAmigos) {

			//polimorfismo
			contato.enviarEmail();
			
//			if(contato instanceof ContatoFamilia) {
//				((ContatoFamilia)contato).enviarEmail();
//			}else if (contato instanceof ContatoTrabalho){
//				((ContatoTrabalho)contato).enviarEmail();
//			}else {
//				((ContatoTinder)contato).enviarEmail();
//			}
		}
		
	}
	
	
	public void compartilhar(String nome) {
		Contato contato = this.pesquisarContato(nome);
		if(contato instanceof Compartilhavel) {
			System.out.println("Compatilhando "+ nome);
		}else {
			System.out.println("Não é compartilhavel");
		}
	}
	
}
