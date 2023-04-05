package com.primeirotrampodev.exercicioCarro.Service;

import com.primeirotrampodev.exercicioCarro.Entidade.Carro;
import com.primeirotrampodev.exercicioCarro.Entidade.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    private Carro getCarroPorId1() {

        Carro carro1 = new Carro();

        carro1.setId(1);
        carro1.setMarca("Fiat");
        carro1.setModelo("Palio");
        carro1.setAno(2008);
        carro1.setCor("Prata");

        return carro1;
    }

    private Carro getCarroPorId2() {

        Carro carro2 = new Carro();

        carro2.setId(2);
        carro2.setMarca("Chrevrolet");
        carro2.setModelo("Onix");
        carro2.setAno(2022);
        carro2.setCor("Branco");

        return carro2;
    }

    private Carro getCarroPorId3() {

        Carro carro3 = new Carro();

        carro3.setId(3);
        carro3.setMarca("Ford");
        carro3.setModelo("Fusion");
        carro3.setAno(2023);
        carro3.setCor("Azul");

        return carro3;
    }

    private Carro getCarroPorId4() {
        Carro carro4 = new Carro();

        carro4.setId(4);
        carro4.setMarca("Fiat");
        carro4.setModelo("Punto Blackmotion");
        carro4.setAno(2016);
        carro4.setCor("Branco");

        return carro4;
    }

    private Carro getCarroPorId5() {
        Carro carro5 = new Carro();

        carro5.setId(5);
        carro5.setMarca("Jeep");
        carro5.setModelo("Renegage");
        carro5.setAno(2021);
        carro5.setCor("Azul");

        return carro5;
    }

    public Carro buscarCarroPorId(Integer id) {

        if (id.equals(1)) {
            return getCarroPorId1();
        } else if (id.equals(2)) {
            return getCarroPorId1();
        } else if (id.equals(3)) {
            return getCarroPorId2();
        } else if (id.equals(4)) {
            return getCarroPorId3();
        } else if (id.equals(5)) {
            return getCarroPorId4();
        } else {
            return new Carro();
        }
    }
}
