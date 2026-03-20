package br.com.fiap.cp1.api.controller;

import br.com.fiap.cp1.api.livro.DadosCadastroLivros;
import br.com.fiap.cp1.api.livro.LivroRepository;
import br.com.fiap.cp1.api.livro.Livro;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @Transactional
    @PostMapping
    //metodo post cadastrar + 2
    public void cadastrarLivro(@RequestBody @Valid DadosCadastroLivros dados){
        livroRepository.save(new Livro(dados));
    }

}
