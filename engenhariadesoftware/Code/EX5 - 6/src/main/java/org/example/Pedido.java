package org.example;


public class Pedido {


    private Cliente cliente;
    private Produto produto;
    private int quantidade;


    public Pedido(Cliente c, Produto p, int qtd) {
        this.cliente = c;
        this.produto = p;
        this.quantidade = qtd;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public Produto getProduto() {
        return produto;
    }


    public double calcularValorTotal() {

        return this.produto.getPrecoUnitario() * this.quantidade;
    }
}