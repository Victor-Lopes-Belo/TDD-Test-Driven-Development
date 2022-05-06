package br.com.tech4me.tdd;

public class Comissao {

    public Double calcularComissao(Double valorVenda) {
        
        double valorComissao;
        
        if (valorVenda < 1000) {
            valorComissao = valorVenda * 0.10;
        } else 
            valorComissao = valorVenda * 0.15;

            return Math.round(valorComissao * 100) / 100d;
    }
}