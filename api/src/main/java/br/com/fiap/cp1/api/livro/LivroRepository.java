package br.com.fiap.cp1.api.livro;

import org.springframework.data.jpa.repository.JpaRepository;

//interface que extende o repositório +1
public interface LivroRepository extends JpaRepository<Livro, Long>{
}
