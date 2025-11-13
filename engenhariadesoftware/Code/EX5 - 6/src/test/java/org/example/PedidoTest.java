package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PedidoTest {

    private Cliente cliente;
    private Produto produto;
    private Pedido pedido;


    @BeforeEach
    void setUp() {
        // cria cenario de teste
        cliente = new Cliente("Ana Costa", "ana.costa@email.com");
        produto = new Produto("Teclado Mecânico", 250.00);
    }


    @Test
    void testGetters() {
        // Testa um pedido com quantidade 1
        pedido = new Pedido(cliente, produto, 1);

    }


    @Test
    void testCalcularValorTotalUnico() {
        // testa com 1 quantidade o preco
        pedido = new Pedido(cliente, produto, 1);
        double precoEsperado = 250.00; // 250.00 * 1

        assertEquals(precoEsperado, pedido.calcularValorTotal(), 0.001, "Cálculo do valor total para 1 unidade falhou.");
    }

    @Test
    void testCalcularValorTotalMultiplo() {
        //testa produto com 3 quantidade
        pedido = new Pedido(cliente, produto, 3);
        double precoEsperado = 750.00; // 250.00 * 3

        assertEquals(precoEsperado, pedido.calcularValorTotal(), 0.001, "Cálculo do valor total para 3 unidades falhou.");
    }

    @Test
    void testCalcularValorTotalZero() {
        // testa pedido com zero
        pedido = new Pedido(cliente, produto, 0);
        double precoEsperado = 0.00; // 250.00 * 0

        assertEquals(precoEsperado, pedido.calcularValorTotal(), 0.001, "Cálculo do valor total para 0 unidades falhou.");
    }
}