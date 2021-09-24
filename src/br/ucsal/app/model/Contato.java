package br.ucsal.app.model;

/**
 * Esta classe representa um 
 * Contato
 * @author mariojp
 *
 */
public abstract class Contato {

	private String firstName;
	private String lastName;

	private String email;
	private String telefone;
	
	/**
	 * Exemplo 
	 * String nome = "Pedro Pereira";        0         1     2
	 * String[] names = nome.split(" "); ["Pedro", "Pereira"];
	 * @param nome
	 * @param telefone
	 * @param email
	 */
	//new Contato("Pedro","xxx","email")
	public Contato(String nome, String telefone, String email) {
		this.setNome(nome);
		this.telefone = telefone;
		this.email = email;
	}
	
	public Contato(String nome,String telefone) {
		this(nome,telefone,"");
	}
	// void set + Nome do Atributo (Parametro Tipo do Atributo variavel) 
	public void setNome(String nome){
		String[] names = nome.split(" ");
		this.firstName = names[0];
		if(names.length > 1) {
			this.lastName = names[names.length-1];
		}else {
			this.lastName ="";
		}
	}
	
	// Tipo do Atributo get + Nome do Atributo
	public String getNome() {
		return this.firstName+" "+lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//Sobrecarga setTelefone(Long telefone)
	public void setTelefone(Long telefone) {
		this.setTelefone(telefone.toString());
	}
	
	//Sobrecarga setTelefone(String telefone)
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public abstract void enviarEmail();

	
	
}
