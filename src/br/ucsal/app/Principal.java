package br.ucsal.app;

public class Principal {

	public static void main(String[] args) {

		GerenciadorContatos meuGC = new GerenciadorContatos();
		
		Contato contato1 = new Contato("Pedro","pedro@email.com","+55 71 98888-8888");
		
		meuGC.adicionarContato(contato1);
		
		
		Contato contato2 = new Contato();
//		contato2.nome = "Maria";
		contato2.setNome("Maria");
		contato2.setEmail("maria@email.com") ;
		contato2.setTelefone("+55 71 99999-8888");
		meuGC.adicionarContato(contato2);
		
		Contato x = meuGC.pesquisarContato("Pedro");
		System.out.println(x);


		//nullPointerException x.telefone => null.telefone
		x = meuGC.pesquisarContato("Mario");
		if(x != null) {
			System.out.println(x.toString());
		}else {
			System.out.println(x);
		}
	}

}
