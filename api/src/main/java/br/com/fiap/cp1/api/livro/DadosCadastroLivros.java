package br.com.fiap.cp1.api.livro;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//+3
public record DadosCadastroLivros(
        @NotBlank
        String titulo,

        @NotBlank
        @Column(unique = true)
        @Size(min=13, max=13)
        String isbn,

        @NotBlank
        String autor,

        Long anopublicacao) {
}
