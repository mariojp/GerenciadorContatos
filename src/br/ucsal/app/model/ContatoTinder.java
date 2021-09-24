package br.ucsal.app.model;

public class ContatoTinder extends Contato {

	
	private Boolean match = Boolean.FALSE;
	
	public ContatoTinder(String nome, String telefone) {
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

	
	
}
