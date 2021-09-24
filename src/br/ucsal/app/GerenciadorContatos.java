package br.ucsal.app;

import br.ucsal.app.model.Contato;
import br.ucsal.app.model.ContatoFamilia;
import br.ucsal.app.model.ContatoTinder;
import br.ucsal.app.model.ContatoTrabalho;

// public class GerenciadorContatos extends Object {
public class GerenciadorContatos {

	//Atributos
	private Contato[] meusAmigos;
	private int quantidadeAmigos;
	
	//Construtor
	GerenciadorContatos() {
		this.meusAmigos = new Contato[500];
		this.quantidadeAmigos = 0;
	}
	
	/**
	 * 
	 * @param contato
	 */
	public void adicionarContato(Contato contato) {
		if(this.existeContato(contato) == false) {
			this.meusAmigos[quantidadeAmigos] = contato;
			//quantidadeAmigos = quantidadeAmigos + 1;
			this.quantidadeAmigos++;
		}
	}
	
	private boolean existeContato(Contato busca) {

		for(int i = 0; i < this.quantidadeAmigos ; i++ ) {
			Contato contato = this.meusAmigos[i];
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
				
		for(int i = 0; i < this.quantidadeAmigos ; i++ ) {
			Contato contato = this.meusAmigos[i];
			if(contato.getNome().contains(byNome)) {
				return contato;
			}
		}
		return null;
	}
	
	
	public void enviarEmail(String texto) {
		for(int i = 0; i < this.quantidadeAmigos ; i++ ) {
			Contato contato = this.meusAmigos[i];
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
	
}
