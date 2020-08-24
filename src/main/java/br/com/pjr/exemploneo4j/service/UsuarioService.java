package br.com.pjr.exemploneo4j.service;

import br.com.pjr.exemploneo4j.modelo.Usuario;
import br.com.pjr.exemploneo4j.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @Transactional
    public Usuario incluir(final Usuario usuario) {
        usuario.setId(null);
        return  usuarioRepository.save(usuario);
    }
}
