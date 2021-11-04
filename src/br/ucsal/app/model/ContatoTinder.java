package br.ucsal.app.model;

public class ContatoTinder extends Contato implements Compartilhavel {

	
	private Boolean match = Boolean.FALSE;
	
	public ContatoTinder(String nome, String telefone) throws Exception {
		super(nome, telefone);
	}

	public Boolean getMatch() {
		return match;
	}

	public void setMatch(Boolean match) {
		this.match = match;
	}

	@Override
	public String toString() {
		return super.toString() + "Deu Macth? "+(match?"SIM":"NÃO");
	}

	@Override
	public void enviarEmail() {
		if(match) { 
		 System.out.println("Opá!!, "+getFirstName());
		} else {
			System.out.println("Deu ruim! "+getFirstName());
		}
	}

	public Contato compartilhar() {
		return this;
	}

	@Override
	public int compareTo(Object o) {
		Contato outro = (Contato) o;
		String nomeContatoInstancia = this.getNome();
		String nomeContatoParametro = outro.getNome();
		return nomeContatoInstancia.compareTo(nomeContatoParametro);
	}
	
}
