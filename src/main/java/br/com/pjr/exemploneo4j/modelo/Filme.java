package br.com.pjr.exemploneo4j.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@NodeEntity
public class Filme {

    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String diretor;
}
