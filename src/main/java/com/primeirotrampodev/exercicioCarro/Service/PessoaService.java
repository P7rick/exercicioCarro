package com.primeirotrampodev.exercicioCarro.Service;

import com.primeirotrampodev.exercicioCarro.Entidade.Carro;
import com.primeirotrampodev.exercicioCarro.Entidade.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private CarroService carroService;

    public Pessoa dadosPessoais(Integer id, String nome, String telefone) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setCarro(carroService.buscarCarroPorId(id));

        return pessoa;
    }

}
