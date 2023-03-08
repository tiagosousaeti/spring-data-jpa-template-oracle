package br.eti.tiagosousa.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.eti.tiagosousa.springdatajpa.model.Pessoa;
import br.eti.tiagosousa.springdatajpa.repository.pessoarepository.PessoaRepositoryQueries;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQueries {
}