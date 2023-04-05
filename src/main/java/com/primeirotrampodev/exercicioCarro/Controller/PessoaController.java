package com.primeirotrampodev.exercicioCarro.Controller;

import com.primeirotrampodev.exercicioCarro.Entidade.Carro;
import com.primeirotrampodev.exercicioCarro.Entidade.Pessoa;
import com.primeirotrampodev.exercicioCarro.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    @GetMapping("/carro-por-id")
    public Pessoa carroPessoa(@RequestParam ("id") Integer id, @RequestParam ("nome") String nome, @RequestParam ("telefone") String telefone){

        return pessoaService.dadosPessoais(id,nome,telefone);
    }
}
