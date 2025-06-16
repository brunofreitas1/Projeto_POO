package com.catalogo.jogos.service;

import com.catalogo.jogos.model.Jogo;
import com.catalogo.jogos.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public Jogo salvar(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    public List<Jogo> listarTodos() {
        return jogoRepository.findAll();
    }

    public Optional<Jogo> buscarPorId(Long id) {
        return jogoRepository.findById(id);
    }

    public void deletar(Long id) {
        jogoRepository.deleteById(id);
    }
}
