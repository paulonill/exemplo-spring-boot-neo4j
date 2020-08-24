package br.com.pjr.exemploneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("br.com.pjr.exemploneo4j.repository")
public class ExemploNeo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemploNeo4jApplication.class, args);
    }

}
