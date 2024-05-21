package br.com.stock.Resolver;

import br.com.stock.model.entity.Pessoa;
import br.com.stock.service.PessoaService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Component
public class PessoaQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PessoaService pessoaService;

    public List<Pessoa> getPessoas() {
        return pessoaService.findAll();
    }

    public Optional<Pessoa> getPessoaById(Long id) {
        return pessoaService.findById(id);
    }
}
