package br.com.pjr.exemploneo4j.service;

import br.com.pjr.exemploneo4j.modelo.Filme;
import br.com.pjr.exemploneo4j.modelo.Usuario;
import br.com.pjr.exemploneo4j.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public Iterable<Filme> listar() {
        return filmeRepository.findAll();
    }

    @Transactional
    public Filme incluir(final Filme filme) {
        filme.setId(null);
        return  filmeRepository.save(filme);
    }

    public Filme pesquisarPorTitulo(String titulo) {
        return filmeRepository.findFilmeByTitulo(titulo);
    }

    public void carregarBase() {
        for(int i=0; i<= 100; i++) {
            Filme filme = new Filme(null, "Filme " + i,"Diretor " + i);
            incluir(filme);
        }
    }
}
