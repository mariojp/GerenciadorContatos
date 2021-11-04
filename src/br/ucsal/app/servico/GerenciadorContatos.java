package br.ucsal.app.servico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.ucsal.app.model.Compartilhavel;
import br.ucsal.app.model.Contato;
import br.ucsal.app.model.ContatoFamilia;
import br.ucsal.app.model.ContatoTinder;
import br.ucsal.app.model.ContatoTrabalho;
import br.ucsal.app.persistencia.ContatoDAO;

// public class GerenciadorContatos extends Object {
public class GerenciadorContatos {


	private ContatoDAO dao;
	
	//ArrayOutOfBound
	//Construtor
	public GerenciadorContatos(ContatoDAO dao) {
		this.dao = dao;
	}
	
	
	public void adicionarContato(String nome, String telefone) throws Exception {
			adicionarContato(new ContatoFamilia(nome,telefone));
	}
	
	/**
	 * 
	 * @param contato
	 */
	public void adicionarContato(Contato contato) {
		dao.insert(contato);
	}
	
	
	public void removerContato(Contato contato) {
		dao.excluir(contato.getId());
	}
	
	
	
	
	public void listar() {
		//Object[] contatos =  meusAmigos.toArray();
		//.sort(contatos);
		//Arrays.sort(contatos, new CompareUltimoNome());
		for(Contato contato : dao.findAll()) {
			System.out.println(contato);
		}
	}
	
	
	public Contato pesquisarContato(String nome) {
		return dao.findByName(nome);
	}
	
	
	public void enviarEmail(String texto) {
		for(Contato contato : dao.findAll()) {

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
		Contato contato = dao.findByName(nome);
		if(contato instanceof Compartilhavel) {
			System.out.println("Compatilhando "+ nome);
		}else {
			System.out.println("Não é compartilhavel");
		}
	}
	
}
