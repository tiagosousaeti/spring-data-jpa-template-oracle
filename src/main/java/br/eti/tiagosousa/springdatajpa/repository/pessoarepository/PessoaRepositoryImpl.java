package br.eti.tiagosousa.springdatajpa.repository.pessoarepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import br.eti.tiagosousa.springdatajpa.model.Pessoa;

public class PessoaRepositoryImpl implements PessoaRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	@Transactional(readOnly = true)
	public List<Pessoa> listar() {
		return manager.createQuery("FROM Pessoa p", Pessoa.class).getResultList();
	}
}