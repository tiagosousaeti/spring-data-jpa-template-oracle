package br.eti.tiagosousa.springdatajpa.repository.pessoarepository;

import java.util.List;

import br.eti.tiagosousa.springdatajpa.model.Pessoa;

public interface PessoaRepositoryQueries {
	public List<Pessoa> listar();
}