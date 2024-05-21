package br.com.stock.model.DTO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class PessoaDTO {

    private String nome;

    private String cpf;
}
