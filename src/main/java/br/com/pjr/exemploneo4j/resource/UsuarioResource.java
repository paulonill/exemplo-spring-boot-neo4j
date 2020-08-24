package br.com.pjr.exemploneo4j.resource;

import br.com.pjr.exemploneo4j.modelo.Filme;
import br.com.pjr.exemploneo4j.modelo.Usuario;
import br.com.pjr.exemploneo4j.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Usuario> listar() {
        return usuarioService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario inserir(@RequestBody Usuario usuario, HttpServletResponse response) {

        final Usuario usuarioSalvo = usuarioService.incluir(usuario);

        final URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuarioSalvo.getId())
                .toUri();

        response.setHeader(HttpHeaders.LOCATION, uri.toString());

        return usuarioSalvo;
    }
}
