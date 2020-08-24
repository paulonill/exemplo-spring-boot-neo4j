# Projeto exemplo utilizando Spring Boot 2 com Neo4j

### Requerimentos/Conhecimentos e Tecnologias utilizadas
* JDK 11   
   (Fonte: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* Spring Boot 2   
   (Fonte: https://spring.io/projects/spring-boot#learn)
* Spring Fox 2.9.X/Swagger 2   
   (Fonte: https://spring.io/guides/tutorials/spring-boot-oauth2/)
* Spring Fox 2.9.X/Swagger 2   
   (Fonte: https://spring.io/guides/tutorials/spring-boot-oauth2/)
* Neo4j
    (Fonte: https://neo4j.com/neo4j-graph-database/)
* Maven 4.0.0+

 ### Intalação e excecução do Neo4j utilzando docker
 

```bashh
$ docker run --publish=7474:7474 --publish=7687:7687 neo4j:4.0
 ```

##### O Neo4j pode ser acessado em http://localhost:7474/

### Serviços do projeto
* Os serviços podem ser acessados através do endereço http://localhost:8080/swagger-ui.html
