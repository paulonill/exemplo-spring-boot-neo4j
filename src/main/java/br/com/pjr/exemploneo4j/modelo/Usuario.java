package br.com.pjr.exemploneo4j.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@NodeEntity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Integer idade;
    @Relationship(type = "RATED", direction = Relationship.INCOMING)
    private List<Filme> filmes;
}
