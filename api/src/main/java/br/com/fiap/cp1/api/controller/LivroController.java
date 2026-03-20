package br.com.fiap.cp1.api.controller;

import java.util.List;
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

    @PostMapping
    @Transactional
    public Livro cadastrarLivro(@RequestBody @Valid DadosCadastroLivros dados){
        return livroRepository.save(new Livro(dados));
    }

    @GetMapping
    public List<Livro> listar(){
        return livroRepository.findAll();
    }

}
