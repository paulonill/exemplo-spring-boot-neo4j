package br.com.pjr.exemploneo4j.repository;

import br.com.pjr.exemploneo4j.modelo.Filme;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FilmeRepository extends Neo4jRepository<Filme, Long> {
    public Filme findFilmeByTitulo(String titulo);
}
