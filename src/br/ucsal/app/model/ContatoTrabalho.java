package br.ucsal.app.model;

public class ContatoTrabalho extends Contato {

	private String empresa;
	
	public ContatoTrabalho(String nome, String telefone,String empresa) throws Exception {
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
	
	
	@Override
	public int compareTo(Object o) {
		Contato outro = (Contato) o;
		//0 igual
		//- this < o
		//+ this > o
		int r = this.getNome().compareTo(outro.getNome());
		if(r == 0) {
			r = this.getEmail().compareTo(outro.getEmail());
		}
		return r;
	}
}
