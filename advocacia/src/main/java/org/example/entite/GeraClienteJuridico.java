package org.example.entite;

public class GeraClienteJuridico implements Gerar{
    @Override
    public Declaracao createDeclaracao() {
        return new DeclaracaoJuridico();
    }

    @Override
    public Receita createReceita() {
        return new ReceitaJuridico();
    }
}
