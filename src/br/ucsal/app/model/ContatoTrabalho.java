package br.ucsal.app.model;

public class ContatoTrabalho extends Contato {

	private String empresa;
	
	public ContatoTrabalho(String nome, String telefone,String empresa) {
		super(nome, telefone);
		this.empresa = empresa;
	}
	

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void enviarEmail() {	
		System.out.println("Prezado, "+(getLastName().isEmpty()?getFirstName():getLastName()));
	}

	
	@Override
	public String toString() {
		return super.toString() +" Empresa: "+this.empresa;
	}
	
}
