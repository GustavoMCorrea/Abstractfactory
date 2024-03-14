package org.example.entite;

public class GeraClienteEstrangeiro implements Gerar{
    @Override
    public Declaracao createDeclaracao() {
        return new DeclaracaoEstrangeiro();
    }

    @Override
    public Receita createReceita() {
        return new ReceitaEstrangeiro();
    }
}
