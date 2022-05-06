package br.com.tech4me.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class ComissaoTests {

    @TestConfiguration
    static class ComissaoConfiguracao {
        @Bean
        public Comissao comissao() {
            return new Comissao();
        }
    }

    @Autowired
    Comissao comissao;

    @Test
    public void deve_calcular_comissao_de_15_e_10_porcento_para_venda() {

        Double valorVenda = 1500.0;
        Double comissaoEsperada = 225.0;

        Double comissaoCalculada = comissao.calcularComissao(valorVenda);

        Assertions.assertEquals(comissaoEsperada, comissaoCalculada);

    }
}