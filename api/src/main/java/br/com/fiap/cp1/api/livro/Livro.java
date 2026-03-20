package br.com.fiap.cp1.api.livro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "livros")
@Entity(name = "Livros")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String isbn;
    private String autor;
    private Long anopublicacao;

    public Livro(DadosCadastroLivros dados){
        this.titulo = dados.titulo();
        this.isbn = dados.isbn();
        this.autor = dados.autor();
        this.anopublicacao = dados.anopublicacao();
    }

}
