package br.com.testepsg.controller;

import br.com.testepsg.model.Questao;
import br.com.testepsg.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questao")
public class QuestaoController {

    @Autowired
    QuestaoRepository questaoRepository;

    @GetMapping
    public List<Questao> buscarQuestoes() {
        return questaoRepository.findAll();
    }
}
