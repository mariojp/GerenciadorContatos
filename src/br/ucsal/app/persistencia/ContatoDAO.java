package br.ucsal.app.persistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import br.ucsal.app.model.Contato;

public class ContatoDAO {

	
	public Map<Long, Contato> tabela = new HashMap<>();
	public AtomicLong atomicLong = new AtomicLong(1);
	
	
	public List<Contato> findAll() {
		return new ArrayList<Contato>(tabela.values());
	}
	
	
	public Long insert(Contato contato) {
		Long id = atomicLong.getAndIncrement();
		tabela.put(id, contato);
		return id;
	}
	
	
	public Boolean excluir(Long id) {
		return (tabela.remove(id) == null)?false:true;
	}
	
	public Boolean update(Contato contato) {
		if(!tabela.containsKey(contato.getId())){
			return false;
		}
		
		tabela.put(contato.getId(), contato);
		return true;
	}


	public Contato findByName(String nome) {
		for(Contato c : tabela.values()) {
			if(c.getNome().contains(nome)) {
				return c;
			}
		}
		return null;
	}
	
	
}
