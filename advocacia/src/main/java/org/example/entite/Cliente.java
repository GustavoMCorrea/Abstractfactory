package org.example.entite;

public class Cliente {
    private Declaracao declaracao;
    private Receita receita;

    public Cliente (Gerar gerar) {
        this.declaracao = gerar.createDeclaracao(); ;
        this.receita = gerar.createReceita();
    }

    public String emitirDeclaracao() {
        return this.declaracao.emitir();
    }

    public String emitirReceita() {
        return this.receita.emitir();
    }
}
