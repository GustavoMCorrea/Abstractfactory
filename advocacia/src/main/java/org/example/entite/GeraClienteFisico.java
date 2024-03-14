package org.example.entite;

public class GeraClienteFisico implements Gerar{
    @Override
    public Declaracao createDeclaracao() {
        return new DeclaracaoFisico();
    }

    @Override
    public Receita createReceita() {
        return new ReceitaFisica();
    }
}
