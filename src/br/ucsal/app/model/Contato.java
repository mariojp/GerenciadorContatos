package br.ucsal.app.model;

/**
 * Esta classe representa um 
 * Contato
 * @author mariojp
 *
 */
public class Contato {

	protected String nome;
	private String email;
	private String telefone;
	
	
	public Contato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Contato(String nome,String telefone) {
		this(nome,telefone,"");
	}
	// void set + Nome do Atributo (Parametro Tipo do Atributo variavel) 
	public void setNome(String nome){
		this.nome = nome;
	}
	
	// Tipo do Atributo get + Nome do Atributo
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelefone(Long telefone) {
		this.setTelefone(telefone.toString());
	}
	
//	if (condicao) {
//		instrucao;
//	}
	public void setTelefone(String telefone) {
		if( telefone.length() <= 9 ) {
			this.telefone = telefone;
		}
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	
	@Override
	public String toString() {
		return "Nome :"+this.getNome()+" Telefone:"+this.getTelefone();
	}
	
	
}
