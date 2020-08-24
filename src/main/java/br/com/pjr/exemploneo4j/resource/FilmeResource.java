package br.com.pjr.exemploneo4j.resource;

import br.com.pjr.exemploneo4j.service.FilmeService;
import br.com.pjr.exemploneo4j.modelo.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@RestController
@RequestMapping("/api/filmes")
public class FilmeResource {

    @Autowired
    private FilmeService filmeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Filme inserir(@RequestBody Filme filme, HttpServletResponse response) {

        final Filme filmeSalvo = filmeService.incluir(filme);

        final URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(filmeSalvo.getId())
                .toUri();

        response.setHeader(HttpHeaders.LOCATION, uri.toString());

        return filmeSalvo;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Filme> listar() {
        return filmeService.listar();
    }

    @GetMapping("/carregar")
    public void carregarBase() {
        filmeService.carregarBase();
    }
}
