package br.eti.tiagosousa.springdatajpa.config.init;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.eti.tiagosousa.springdatajpa.config.JpaConfig;
import br.eti.tiagosousa.springdatajpa.model.Pessoa;
import br.eti.tiagosousa.springdatajpa.repository.PessoaRepository;

public class AppInitializer {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);

		PessoaRepository pessoaRepository = context.getBean(PessoaRepository.class);

		List<Pessoa> lista = pessoaRepository.listar();
		
		System.out.println(lista.size());
		
		context.close();
	}
}