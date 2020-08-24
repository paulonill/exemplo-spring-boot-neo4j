package br.com.pjr.exemploneo4j.repository;

import br.com.pjr.exemploneo4j.modelo.Usuario;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UsuarioRepository extends Neo4jRepository<Usuario, Long> {
}
