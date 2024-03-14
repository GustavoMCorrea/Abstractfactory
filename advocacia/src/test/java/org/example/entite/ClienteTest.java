package org.example.entite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirDeclaracaoEstrangeiro() {
        Gerar gerar = new GeraClienteEstrangeiro();
        Cliente cliente = new Cliente(gerar);
        assertEquals("Declaração Cliente Estrangeiro", cliente.emitirDeclaracao());
    }

    @Test
    void deveEmitirDeclaracaoFisico() {
        Gerar gerar = new GeraClienteFisico();
        Cliente cliente = new Cliente(gerar);
        assertEquals("Declaração Cliente Físico", cliente.emitirDeclaracao());
    }

    @Test
    void deveEmitirDeclaracaoJuridico() {
        Gerar gerar = new GeraClienteJuridico();
        Cliente cliente = new Cliente(gerar);
        assertEquals("Declaração Cliente Jurídico", cliente.emitirDeclaracao());
    }

    @Test
    void deveEmitirReceitaEstrangeiro() {
        Gerar gerar = new GeraClienteEstrangeiro();
        Cliente cliente = new Cliente(gerar);
        assertEquals("Receita Cliente Estrangeiro", cliente.emitirReceita());
    }

    @Test
    void deveEmitirReceitaFisico() {
        Gerar gerar = new GeraClienteFisico();
        Cliente cliente = new Cliente(gerar);
        assertEquals("Receita Cliente Físico", cliente.emitirReceita());
    }

    @Test
    void deveEmitirReceitaJuridico() {
        Gerar gerar = new GeraClienteJuridico();
        Cliente cliente = new Cliente(gerar);
        assertEquals("Receita Cliente Jurídico", cliente.emitirReceita());
    }


}