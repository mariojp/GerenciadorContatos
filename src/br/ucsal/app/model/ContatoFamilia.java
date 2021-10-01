package br.ucsal.app.model;

public class ContatoFamilia extends Contato {

	
	
	private  String aniversario;
	
	public ContatoFamilia(String nome, String telefone) {
		super(nome,telefone);
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public String toString() {
		//return super.toString()+ " Niver: "+aniversario;
		return "Nome :"+this.getNome()+" Telefone:"+this.getTelefone()+ " Niver: "+aniversario;
	}
	
	@Override
	public void enviarEmail() {
		System.out.println("Olá "+getFirstName());
	}

	@Override
	public int compareTo(Object o) {
		return this.getNome().compareTo( ( (Contato) o).getNome()   );
	}

	
 


}
