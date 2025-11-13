package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ProdutoTest {

    private Produto produto;
    private String nomeProduto = "Notebook Ultra Fino";
    private double precoProduto = 5000.00;

 // cria uim produto
    @BeforeEach
    void setUp() {
        produto = new Produto(nomeProduto, precoProduto);
    }

// testa get nome
    @Test
    void testGetNome() {
        assertEquals(nomeProduto, produto.getNome(), "O nome do produto não corresponde ao esperado.");
    }
}